import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.net.Socket;
import org.junit.Assert;
import static org.junit.Assert.*;
public class ThreadTest {

    @Test
    public void testSent() { 
    	for (int i = 0; i < 9; i++) {
    		client objClient = new client(i);
    		objClient.start();
    		Assert.assertTrue(objClient.sentTo());
    	}
    }
}

