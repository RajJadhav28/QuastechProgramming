package PriorityQueue;

import java.util.LinkedList;
import java.util.Queue;

public class Pro2 {
	public static void main(String[] args) {
	Queue<String> queue = new LinkedList<>();
    
    System.out.println("=== QUEUE OPERATIONS ===\n");
    
    // Add elements (enqueue)
    System.out.println("1. Adding elements to queue:");
    queue.add("Customer 1");
    queue.add("Customer 2");
    queue.add("Customer 3");
    queue.add("Customer 4");
    System.out.println("Queue: " + queue);
    
    // Peek (view front element)
    System.out.println("\n2. Peek front element: " + queue.peek());
    
    // Remove elements (dequeue)
    System.out.println("\n3. Removing elements from queue:");
    System.out.println("Removed: " + queue.remove());
    System.out.println("Removed: " + queue.poll());  // alternative to remove()
    System.out.println("Queue after removals: " + queue);
    
    // Check specific elements
    System.out.println("\n4. Checking queue:");
    System.out.println("Queue size: " + queue.size());
    System.out.println("Contains 'Customer 3'? " + queue.contains("Customer 3"));
    
    // Process all elements
    System.out.println("\n5. Processing all elements:");
    while (!queue.isEmpty()) {
        System.out.println("Processing: " + queue.poll());
    }
    System.out.println("Queue after processing: " + queue);
    
    // Handle empty queue safely
    System.out.println("\n6. Safe operations on empty queue:");
    System.out.println("Poll on empty queue: " + queue.poll());  // returns null
    System.out.println("Peek on empty queue: " + queue.peek());  // returns null
}
}
