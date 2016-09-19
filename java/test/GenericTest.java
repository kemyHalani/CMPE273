import static org.junit.Assert.*;

import org.junit.Test;

public class GenericTest {
	String name = Generic.stringOb();
	int age = Generic.integerOb();

	@Test
	public void testString() {

		assertEquals("Kemy", name);
	}

	public void testInt() {

		assertEquals(22, age);
	}

}