import java.net.*;
import java.io.*;

public class client extends Thread {

	static final int port = 5555;
	Socket socket;
	DataInputStream in;
	DataOutputStream out;
	int id;

	public client(int id) {
		this.id = id;
	}

	public void run() {
		try {
			this.socket = new Socket("localhost", port);
			System.out.println("client connected");
			boolean result = sentTo();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean sentTo() {
		try {
			out = new DataOutputStream(socket.getOutputStream());
			out.write(id);
			in = new DataInputStream(socket.getInputStream());
			int str = in.read();
			System.out.println("data from server: \n" + str);
			socket.close();
			System.out.println("closed");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean receiveFrom() {
		boolean receive = false;
		try {	
			receive = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return receive;
	}

	public static void main(String args[]) throws Exception {
		System.out.println("connecting");
		for (int i = 0; i < 9; i++) {
			client objClient = new client(i);
			objClient.start();
		}
	}
}