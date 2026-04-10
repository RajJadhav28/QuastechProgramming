package ArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pro3 {
	public static void main(String[] args) {
		Deque<String> deque=new ArrayDeque<String>();
		System.out.println("=== DEQUE OPERATIONS ===\n");
		
		//Add elements at both ends
		System.out.println("1.Adding elements:");
		deque.addFirst("Front 1");
		deque.addLast("Rear 1");
		deque.offerFirst("Front 2");
		deque.offerLast("Rear 2");
		System.out.println("Deque:"+deque);
		
		// View elements
        System.out.println("\n2. Viewing elements:");
        System.out.println("First element:"+deque.getFirst());
        System.out.println("Last element:"+deque.getLast());
        System.out.println("Peek first:"+deque.peekFirst());
        System.out.println("Peek last:"+deque.peekLast());
        
     // Remove from both ends
        System.out.println("\n3. Removing elements:");
        System.out.println("Remove first:"+deque.removeFirst());
        System.out.println("Remove last:"+deque.removeLast());
        System.out.println("Deque after removal:"+deque);
        
     // Stack operations using Deque
        System.out.println("\n4. Using as Stack:");
        deque.push("Stack Item 1");
        deque.push("Stack Item 2");
        System.out.println("After pushes:"+deque);
        System.out.println("Pop:"+deque.pop());
        
     // Queue operations using Deque
        System.out.println("\n5. Using as Queue:");
        deque.offer("Queue Item 1");  // add to end
        deque.offer("Queue Item 2");
        System.out.println("After offers: " + deque);
        System.out.println("Poll: " + deque.poll());
        
        System.out.println("\nFinal Deque: " + deque);
	}
}
