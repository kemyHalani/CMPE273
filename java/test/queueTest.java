import static org.junit.Assert.*;
import org.junit.Test;

public class queueTest {
	queue queue1 = new queue();

	@Test
	public void testEquals() {
		queue1.Add();
		assertEquals(0, queue1.Remove());
		assertEquals(1, queue1.Element());
		queue1.Offer();
		queue1.Poll();
		assertEquals(2, queue1.Peek());
	}

	@Test
	public void testPeek() {
		queue1.Add();
		assertEquals(0, queue1.Peek());
		queue1.Poll();
	}
}