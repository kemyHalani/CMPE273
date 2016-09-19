import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayTest {
	Array array = new Array();
	int matrix[][] = new int[3][3];

	@Test
	public void testAddition() {
		matrix = array.addition();
		assertEquals(5, matrix[2][2]);
	}

	@Test
	public void testDisplay() {
		array.addition();
		assertTrue(array.display());
	}
}