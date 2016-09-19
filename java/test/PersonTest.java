import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {
	Person person = new Person();

	@Test
	public void testChapters() {
		assertEquals(10, person.numberOfChapters());
	}

	@Test
	public void testSubjects() {
		assertEquals(4, person.numberOfSubjects());
	}

	@Test
	public void testStudents() {
		assertEquals(90, person.numberOfStudents());
	}

	@Test
	public void testPracticals() {
		assertEquals(3, person.numberOfPracticals());
	}
}