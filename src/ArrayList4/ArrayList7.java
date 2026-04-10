package ArrayList4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList7 {
	public static void main(String[] args) {
ArrayList<String> list = new ArrayList<>();
        
        // === 1. ADDITION OPERATIONS ===
        System.out.println("=== ADDITION ===");
        list.add("Apple");                    // add to end
        list.add(0, "Banana");               // add at specific index
        list.addAll(List.of("Cherry", "Date")); // add collection
        list.addAll(1, List.of("Elderberry", "Fig")); // add at index
        list.ensureCapacity(20);              // ensure minimum capacity
        System.out.println("After additions: " + list);
        
        // === 2. ACCESS OPERATIONS ===
        System.out.println("\n=== ACCESS ===");
        System.out.println("get(2): " + list.get(2));
        System.out.println("indexOf('Cherry'): " + list.indexOf("Cherry"));
        System.out.println("lastIndexOf('Apple'): " + list.lastIndexOf("Apple"));
        System.out.println("contains('Fig'): " + list.contains("Fig"));
        System.out.println("containsAll([Fig, Date]): " + list.containsAll(List.of("Fig", "Date")));
        System.out.println("size(): " + list.size());
        System.out.println("isEmpty(): " + list.isEmpty());
        
        // === 3. SUBLIST OPERATIONS ===
        System.out.println("\n=== SUBLIST ===");
        List<String> subList = list.subList(1, 4);
        System.out.println("sublist(1,4): " + subList);
        
        // === 4. ITERATION OPERATIONS ===
        System.out.println("\n=== ITERATION ===");
        
        // For loop
        System.out.print("For loop: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        
        // Enhanced for loop
        System.out.print("\nEnhanced for: ");
        for (String item : list) {
            System.out.print(item + " ");
        }
        
        // Iterator
        System.out.print("\nIterator: ");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        
        // ListIterator (bidirectional)
        System.out.print("\nListIterator (reverse): ");
        ListIterator<String> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }
        
        // === 5. MODIFICATION OPERATIONS ===
        System.out.println("\n\n=== MODIFICATION ===");
        System.out.println("set(2, 'Grape'): " + list.set(2, "Grape"));
        System.out.println("After set: " + list);
        
        // === 6. REMOVAL OPERATIONS ===
        System.out.println("\n=== REMOVAL ===");
        System.out.println("remove(1): " + list.remove(1));
        System.out.println("remove('Date'): " + list.remove("Date"));
        list.removeAll(List.of("Fig"));  // remove all occurrences
        System.out.println("After removals: " + list);
        
        // Remove with iterator
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().startsWith("A")) {
                it.remove();
            }
        }
        System.out.println("After iterator removal: " + list);
        
        list.removeIf(item -> item.contains("r")); // remove if condition
        System.out.println("After removeIf: " + list);
        
        // === 7. BULK OPERATIONS ===
        System.out.println("\n=== BULK OPERATIONS ===");
        list.retainAll(List.of("Banana", "Grape")); // keep only these
        System.out.println("After retainAll: " + list);
        
        // === 8. CONVERSION OPERATIONS ===
        System.out.println("\n=== CONVERSION ===");
        Object[] array = list.toArray();
        String[] stringArray = list.toArray(new String[0]);
        System.out.println("Array length: " + array.length);
        
        // === 9. UTILITY OPERATIONS ===
        System.out.println("\n=== UTILITY ===");
        ArrayList<String> clone = (ArrayList<String>) list.clone();
        System.out.println("Clone: " + clone);
        
        Collections.sort(list);
        System.out.println("Sorted: " + list);
        
        Collections.reverse(list);
        System.out.println("Reversed: " + list);
        
        Collections.shuffle(list);
        System.out.println("Shuffled: " + list);
        
        // === 10. CLEARING ===
        System.out.println("\n=== CLEARING ===");
        list.clear();
        System.out.println("After clear: " + list);
        System.out.println("isEmpty: " + list.isEmpty());
    }
	}

