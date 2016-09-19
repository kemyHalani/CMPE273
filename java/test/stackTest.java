import org.junit.Test;
import static org.junit.Assert.*;

public class stackTest {
	stack stack1 = new stack();

	@Test
	public void testEquals() {
		stack1.Push();
		int array[] = { 2, 7, 9, 7, 2 };
		int[] array2 = stack1.Pop();
		for (int i = 0; i <= 4; i++)
			System.out.print(array2[i] + " ");
		assertArrayEquals(array, array2);
		System.out.println("\nString is palindrome");
	}

	@Test
	public void testPeek() {
		stack1.Push();
		assertEquals(2, stack1.Peek());
	}

	@Test
	public void testSearch() {
		stack1.Push();
		assertEquals(3, stack1.Search());
	}
}