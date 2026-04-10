package Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Pro5 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
        
        // === 1. ADDITION OPERATIONS ===
        System.out.println("=== ADDITION ===");
        System.out.println("add('A'): " + set.add("A"));
        System.out.println("add('B'): " + set.add("B"));
        System.out.println("add('A'): " + set.add("A")); // duplicate
        set.addAll(List.of("C", "D", "E"));
        System.out.println("Set: " + set);
        
        // === 2. CHECK OPERATIONS ===
        System.out.println("\n=== CHECK ===");
        System.out.println("contains('B'): " + set.contains("B"));
        System.out.println("contains('X'): " + set.contains("X"));
        System.out.println("containsAll([A, C]): " + set.containsAll(List.of("A", "C")));
        System.out.println("isEmpty(): " + set.isEmpty());
        System.out.println("size(): " + set.size());
        
        // === 3. ITERATION OPERATIONS ===
        System.out.println("\n=== ITERATION ===");
        System.out.print("Enhanced for: ");
        for (String item : set) {
            System.out.print(item + " ");
        }
        
        System.out.print("\nIterator: ");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.print(item + " ");
        }
        
        // === 4. REMOVAL OPERATIONS ===
        System.out.println("\n\n=== REMOVAL ===");
        System.out.println("remove('C'): " + set.remove("C"));
        System.out.println("remove('X'): " + set.remove("X")); // not present
        
        // Remove with iterator
        iterator = set.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("D")) {
                iterator.remove();
            }
        }
        System.out.println("After iterator remove: " + set);
        
        // === 5. BULK OPERATIONS ===
        System.out.println("\n=== BULK OPERATIONS ===");
        HashSet<String> set2 = new HashSet<>(List.of("E", "F", "G"));
        
        // Union
        set.addAll(set2);
        System.out.println("Union (addAll): " + set);
        
        // Intersection
        set.retainAll(List.of("A", "E", "F"));
        System.out.println("Intersection (retainAll): " + set);
        
        // Difference
        set.removeAll(List.of("F"));
        System.out.println("Difference (removeAll): " + set);
        
        // === 6. SET COMPARISON ===
        System.out.println("\n=== SET COMPARISON ===");
        HashSet<String> set3 = new HashSet<>(List.of("A", "E"));
        System.out.println("equals(set3): " + set.equals(set3));
        System.out.println("hashCode(): " + set.hashCode());
        
        // === 7. CONVERSION OPERATIONS ===
        System.out.println("\n=== CONVERSION ===");
        Object[] array = set.toArray();
        String[] strArray = set.toArray(new String[0]);
        System.out.println("Array: " + Arrays.toString(strArray));
        
        // === 8. CLEARING ===
        System.out.println("\n=== CLEARING ===");
        set.clear();
        System.out.println("After clear: " + set);
        System.out.println("size(): " + set.size());
        System.out.println("isEmpty(): " + set.isEmpty());
        
        // === 9. PERFORMANCE OPERATIONS ===
        System.out.println("\n=== PERFORMANCE ===");
        HashSet<String> largeSet = new HashSet<>(100); // initial capacity
        largeSet.add("Test");
        System.out.println("Initial capacity constructor used");
        
        // === 10. NULL HANDLING ===
        System.out.println("\n=== NULL HANDLING ===");
        set.add(null);
        set.add(null); // only one null allowed
        System.out.println("Set with null: " + set);
        System.out.println("contains(null): " + set.contains(null));
	}
}
