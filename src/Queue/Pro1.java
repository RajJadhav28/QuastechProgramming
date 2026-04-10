package Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Pro1 {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
        
        // === 1. ADD/INSERT OPERATIONS ===
        System.out.println("=== ADD/INSERT ===");
        queue.add("A");      // throws exception if full
        queue.offer("B");    // returns false if full
        queue.add("C");
        queue.offer("D");
        ((LinkedList<String>) queue).addFirst("First"); // LinkedList specific
        ((LinkedList<String>) queue).addLast("Last");   // LinkedList specific
        ((LinkedList<String>) queue).push("Pushed");    // Stack operation
        System.out.println("Queue: " + queue);
        
        // === 2. PEEK/EXAMINE OPERATIONS ===
        System.out.println("\n=== PEEK/EXAMINE ===");
        System.out.println("peek(): " + queue.peek());      // returns null if empty
        System.out.println("element(): " + queue.element()); // throws exception if empty
        
        // LinkedList specific peek
        System.out.println("peekFirst(): " + ((LinkedList<String>) queue).peekFirst());
        System.out.println("peekLast(): " + ((LinkedList<String>) queue).peekLast());
        System.out.println("getFirst(): " + ((LinkedList<String>) queue).getFirst());
        System.out.println("getLast(): " + ((LinkedList<String>) queue).getLast());
        
        // === 3. REMOVE/POLL OPERATIONS ===
        System.out.println("\n=== REMOVE/POLL ===");
        System.out.println("poll(): " + queue.poll());      // returns null if empty
        System.out.println("remove(): " + queue.remove());  // throws exception if empty
        System.out.println("remove('C'): " + queue.remove("C"));
        
        // LinkedList specific remove
        System.out.println("removeFirst(): " + ((LinkedList<String>) queue).removeFirst());
        System.out.println("removeLast(): " + ((LinkedList<String>) queue).removeLast());
        System.out.println("pop(): " + ((LinkedList<String>) queue).pop()); // Stack operation
        
        System.out.println("After removals: " + queue);
        
        // === 4. SEARCH OPERATIONS ===
        System.out.println("\n=== SEARCH ===");
        System.out.println("contains('A'): " + queue.contains("A"));
        System.out.println("contains('B'): " + queue.contains("B"));
        System.out.println("indexOf('B'): " + ((LinkedList<String>) queue).indexOf("B"));
        System.out.println("lastIndexOf('B'): " + ((LinkedList<String>) queue).lastIndexOf("B"));
        
        // === 5. ITERATION OPERATIONS ===
        System.out.println("\n=== ITERATION ===");
        System.out.print("Iterator: ");
        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        
        System.out.print("\nDescendingIterator: ");
        Iterator<String> descIterator = ((LinkedList<String>) queue).descendingIterator();
        while (descIterator.hasNext()) {
            System.out.print(descIterator.next() + " ");
        }
        
        // === 6. SIZE & EMPTINESS ===
        System.out.println("\n\n=== SIZE & EMPTINESS ===");
        System.out.println("size(): " + queue.size());
        System.out.println("isEmpty(): " + queue.isEmpty());
        
        // === 7. LIST OPERATIONS (LinkedList specific) ===
        System.out.println("\n=== LIST OPERATIONS ===");
        LinkedList<String> ll = (LinkedList<String>) queue;
        ll.add(1, "Inserted");
        System.out.println("After add at index: " + queue);
        
        System.out.println("get(2): " + ll.get(2));
        System.out.println("set(2, 'Replaced'): " + ll.set(2, "Replaced"));
        System.out.println("After set: " + queue);
        
        // === 8. BULK OPERATIONS ===
        System.out.println("\n=== BULK OPERATIONS ===");
        ll.addAll(List.of("X", "Y", "Z"));
        System.out.println("After addAll: " + queue);
        
        ll.removeAll(List.of("X", "Y"));
        System.out.println("After removeAll: " + queue);
        
        ll.retainAll(List.of("Replaced", "Last"));
        System.out.println("After retainAll: " + queue);
        
        // === 9. CONVERSION ===
        System.out.println("\n=== CONVERSION ===");
        Object[] array = queue.toArray();
        String[] strArray = queue.toArray(new String[0]);
        System.out.println("Array length: " + array.length);
        
        // === 10. CLEARING ===
        System.out.println("\n=== CLEARING ===");
        queue.clear();
        System.out.println("After clear: " + queue);
        
        // Test empty queue operations
        System.out.println("poll() on empty: " + queue.poll());
        System.out.println("peek() on empty: " + queue.peek());
        try {
            queue.remove();
        } catch (NoSuchElementException e) {
            System.out.println("Caught NoSuchElementException on remove()");
        }
	}

}
