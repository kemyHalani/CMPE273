import java.net.*;
import java.io.*;

public class server implements Runnable {
	static ServerSocket serverSocket;
	Socket socket;
	DataOutputStream out;
	DataInputStream in;

	public server(Socket childSocket) {
		this.socket = childSocket;
	}

	public void run() {
		System.out.println("connected" + socket.getInetAddress());
		try {
			in = new DataInputStream(socket.getInputStream());
			int clientMessage = in.read();
			System.out.println("ID of client:" + clientMessage);

			out = new DataOutputStream(socket.getOutputStream());
			out.write(clientMessage);
			System.out.println("data sent");
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("closed");
	}

	public static void main(String args[]) throws Exception {
		System.out.println("server starting");
		int port = Integer.parseInt(args[0]);
		serverSocket = new ServerSocket(port);
		System.out.println("server started");
		while (true) {
			Socket sock = serverSocket.accept();
			server objServer = new server(sock);
			Thread objThead = new Thread(objServer);
			objThead.start();
			// new Thread(new server(serverSocket.accept())).start();;
		}
	}
}