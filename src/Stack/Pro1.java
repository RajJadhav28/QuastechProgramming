package Stack;

import java.util.Stack;

public class Pro1 {

	public static void main(String[] args) {
		Stack<String>animals=new Stack();
		animals.push("dog");
		animals.push("cat");
		animals.push("lion");
		animals.push("tiger");
		animals.push("leapord");
		System.out.println("Stack:"+animals);
		System.out.println(animals.pop());
		String elements=animals.pop();
		System.out.println("Removed elements:"+elements);
		System.out.println(animals);
		System.out.println(animals.peek());

	}

}
