package Stack1;

import java.util.Stack;

public class Pro1 {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
        
        System.out.println("=== STACK OPERATIONS ===\n");
        
        // Push elements
        System.out.println("1. Pushing elements:");
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        stack.push("Fourth");
        System.out.println("Stack: " + stack);
        
        // Peek (view top element)
        System.out.println("\n2. Peek top element: " + stack.peek());
        
        // Pop elements (remove from top)
        System.out.println("\n3. Popping elements:");
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Stack after pops: " + stack);
        
        // Search in stack
        System.out.println("\n4. Searching:");
        System.out.println("Position of 'First' from top: " + stack.search("First"));
        System.out.println("Position of 'Second' from top: " + stack.search("Second"));
        
        // Check if empty
        System.out.println("\n5. Is stack empty? " + stack.isEmpty());
        
        // Pop remaining
        System.out.println("\n6. Popping remaining:");
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
        System.out.println("Is stack empty now? " + stack.isEmpty());
	}
}
