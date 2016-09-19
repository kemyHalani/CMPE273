import java.util.Stack;

public class stack {

	Stack<Integer> stack = new Stack<Integer>();

	public void Push() {
		int[] a = { 2, 7, 9, 7, 2 };
		for (int i = 0; i <= 4; i++)
			stack.push(a[i]);
		System.out.println("\nElemnts of stack are" + stack);
	}

	public int[] Pop() {
		int pop[] = new int[stack.size()];

		for (int i = 0; i <= 4; i++)
			pop[i] = stack.pop();
		System.out.println("Result of pop method:" + stack);
		return pop;
	}

	public int Search() {
		int search = stack.search(9);
		System.out.println("Position of element 9 in stack is:" + search);
		return search;
	}

	public int Peek() {
		int peek = stack.peek();
		System.out.println("Result of peek method:" + peek);
		return peek;
	}

	public boolean Empty() {
		if (stack.empty()) {
			return true;
		}
		return false;
	}
}