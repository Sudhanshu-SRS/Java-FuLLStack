package pkg_04_08_2025_stack;
import java.util.*;

public class Stack1 {
	static void showpush(Stack st, int a) {
		st.push(a);
		//System.out.println("push(" + a + ")");
		System.out.println("stack: " + st);
	}
	static void showpop(Stack st) {
		Integer a = (Integer) st.pop();
		//System.out.println("pop -> " + a);
		System.out.println("stack: " + st);
	}

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println("Initial stack: " + stack);
		
		showpush(stack, 1);
		showpush(stack, 2);
		showpush(stack, 3);
		System.out.println("Now Poping 3 elements insdie the stack");
		showpop(stack);
		showpop(stack);
		showpop(stack);
	
		
		try {
			showpop(stack);
		} catch (Exception e) {
			System.out.println("Stack is empty, cannot pop.");
		}

	}

}
