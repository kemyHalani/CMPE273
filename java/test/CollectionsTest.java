
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;
import org.junit.Test;

public class CollectionsTest {
	collections collection = new collections();
	HashMap<Integer, String> map = collection.insert();

	@Test
	public void testMap() {

		String var = map.get(2);
		System.out.println("Value at index 2 is: " + var);
		assertEquals("Kemy", var);
	}

	@Test
	public void testRemove() {
		map.remove(5);
		System.out.println("Map key and values after removal:");
		Set set3 = map.entrySet();
		Iterator iterator3 = set3.iterator();
		while (iterator3.hasNext()) {
			Map.Entry mentry3 = (Map.Entry) iterator3.next();
			System.out.print("Key is: " + mentry3.getKey() + " & Value is: ");
			System.out.println(mentry3.getValue());

		}
		assertEquals(null, map.get(5));
	}
}