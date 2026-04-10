package Stack1;

import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;

public class Pro3 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
        
        // === 1. PUSH OPERATIONS ===
        System.out.println("=== PUSH ===");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.add(50);  // inherited from Vector
        stack.addElement(60); // Vector method
        System.out.println("Stack: " + stack);
        
        // === 2. PEEK OPERATIONS ===
        System.out.println("\n=== PEEK ===");
        System.out.println("peek(): " + stack.peek());
        System.out.println("lastElement(): " + stack.lastElement()); // Vector
        System.out.println("elementAt(2): " + stack.elementAt(2)); // Vector
        
        // === 3. POP OPERATIONS ===
        System.out.println("\n=== POP ===");
        System.out.println("pop(): " + stack.pop());
        System.out.println("remove(2): " + stack.remove(2)); // Vector - by index
        System.out.println("removeElement(30): " + stack.removeElement(30)); // Vector
        System.out.println("After pops: " + stack);
        
        // === 4. SEARCH OPERATIONS ===
        System.out.println("\n=== SEARCH ===");
        System.out.println("search(20): " + stack.search(20)); // 1-based from top
        System.out.println("search(10): " + stack.search(10));
        System.out.println("contains(20): " + stack.contains(20)); // Vector
        System.out.println("indexOf(20): " + stack.indexOf(20)); // Vector
        
        // === 5. ITERATION OPERATIONS ===
        System.out.println("\n=== ITERATION ===");
        System.out.print("For loop: ");
        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i) + " "); // Vector method
        }
        
        System.out.print("\nEnhanced for: ");
        for (Integer num : stack) {
            System.out.print(num + " ");
        }
        
        // === 6. STACK-SPECIFIC ===
        System.out.println("\n\n=== STACK SPECIFIC ===");
        System.out.println("empty(): " + stack.empty());
        
        // Empty stack exception
        Stack<Integer> emptyStack = new Stack<>();
        try {
            emptyStack.pop();
        } catch (EmptyStackException e) {
            System.out.println("Caught EmptyStackException on pop()");
        }
        
        // === 7. VECTOR INHERITED OPERATIONS ===
        System.out.println("\n=== VECTOR OPERATIONS ===");
        System.out.println("capacity(): " + stack.capacity());
        System.out.println("size(): " + stack.size());
        stack.setSize(10);
        System.out.println("After setSize(10): " + stack.size());
        
        stack.trimToSize();
        System.out.println("After trimToSize");
        
        stack.set(0, 100); // Vector - set at index
        System.out.println("After set(0,100): " + stack);
        
        stack.insertElementAt(200, 1); // Vector
        System.out.println("After insertElementAt: " + stack);
        
        // === 8. BULK OPERATIONS ===
        System.out.println("\n=== BULK OPERATIONS ===");
        stack.addAll(List.of(300, 400, 500));
        System.out.println("After addAll: " + stack);
        
        stack.removeAllElements(); // Vector
        System.out.println("After removeAllElements: " + stack);
        
        // === 9. CLEARING ===
        System.out.println("\n=== CLEARING ===");
        stack.clear();
        System.out.println("After clear: " + stack);
        System.out.println("empty(): " + stack.empty());
	}
}
