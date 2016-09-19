import java.util.LinkedList;
import java.util.Queue;

public class queue {

	Queue<Integer> queue = new LinkedList<Integer>();

	public void Add() {
		for (int i = 0; i <= 4; i++)
			queue.add(i);
		System.out.println("Elements of queue are" + queue);
	}

	public int Remove() {
		int remove = queue.remove();
		System.out.println("Result of remove method:" + remove);
		return remove;
	}

	public int Element() {
		int element = queue.element();
		System.out.println("Result of element method:" + element);
		return element;
	}

	public void Offer() {
		queue.offer(5);
		System.out.println("Result of offer method:" + queue);
	}

	public int Peek() {
		int peek = queue.peek();
		System.out.println("Result of peek method:" + peek);
		return peek;
	}

	public int Poll() {
		int poll = queue.poll();
		System.out.println("Result of poll method:" + queue);
		return poll;
	}

}