package Set;

import java.util.Iterator;
import java.util.TreeSet;

public class Pro7 {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>();
        
        System.out.println("=== TREESET OPERATIONS ===\n");
        
        // Add elements (automatically sorted)
        System.out.println("1. Adding elements (automatic sorting):");
        treeSet.add(50);
        treeSet.add(20);
        treeSet.add(80);
        treeSet.add(10);
        treeSet.add(30);
        treeSet.add(20);  // Duplicate
        System.out.println("TreeSet: " + treeSet);
        
        // Navigational methods
        System.out.println("\n2. Navigational methods:");
        System.out.println("First element: " + treeSet.first());
        System.out.println("Last element: " + treeSet.last());
        System.out.println("Lower than 25: " + treeSet.lower(25));  // greatest element < 25
        System.out.println("Higher than 25: " + treeSet.higher(25)); // least element > 25
        System.out.println("Floor of 25: " + treeSet.floor(25));    // greatest element ≤ 25
        System.out.println("Ceiling of 25: " + treeSet.ceiling(25)); // least element ≥ 25
        
        // Subset operations
        System.out.println("\n3. Subset operations:");
        System.out.println("HeadSet (< 30): " + treeSet.headSet(30));
        System.out.println("TailSet (≥ 30): " + treeSet.tailSet(30));
        System.out.println("SubSet (20 to 50): " + treeSet.subSet(20, 50));
        
        // Remove elements
        System.out.println("\n4. Removing elements:");
        System.out.println("Remove 20: " + treeSet.remove(20));
        System.out.println("Remove 100 (not present): " + treeSet.remove(100));
        System.out.println("TreeSet after removal: " + treeSet);
        
        // Poll first and last
        System.out.println("\n5. Poll operations:");
        System.out.println("Poll first: " + treeSet.pollFirst());
        System.out.println("Poll last: " + treeSet.pollLast());
        System.out.println("TreeSet after polls: " + treeSet);
        
        // Descending order
        System.out.println("\n6. Descending order:");
        System.out.print("Descending set: ");
        TreeSet<Integer> descendingSet = (TreeSet<Integer>) treeSet.descendingSet();
        for (Integer num : descendingSet) {
            System.out.print(num + " ");
        }
        
        // Iterator in descending order
        System.out.println("\n\n7. Descending iterator:");
        Iterator<Integer> descIterator = treeSet.descendingIterator();
        System.out.print("Elements: ");
        while (descIterator.hasNext()) {
            System.out.print(descIterator.next() + " ");
        }
        
        // Clear
        System.out.println("\n\n8. Clearing TreeSet:");
        treeSet.clear();
        System.out.println("TreeSet after clear: " + treeSet);
	}
}
