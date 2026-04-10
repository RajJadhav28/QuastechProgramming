package Set;

import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Pro11 {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet=new TreeSet<Integer>();
		
		// === 1. ADDITION OPERATIONS ===
        System.out.println("=== ADDITION ===");
        System.out.println("add(50): " + treeSet.add(50));
        System.out.println("add(30): " + treeSet.add(30));
        System.out.println("add(70): " + treeSet.add(70));
        System.out.println("add(20): " + treeSet.add(20));
        System.out.println("add(50): " + treeSet.add(50)); // duplicate
        treeSet.addAll(List.of(40,60,80,10));
        System.out.println("TreeSet (sorted):"+treeSet);
        
     // === 2. ACCESS OPERATIONS ===
        System.out.println("\n=== ACCESS ===");
        System.out.println("first():"+treeSet.first());
        System.out.println("last():"+treeSet.last());
        System.out.println("lower(35):"+treeSet.lower(35));//<35
        System.out.println("higher(35):"+treeSet.higher(35));//>35
        System.out.println("floor(35):"+treeSet.floor(35));//≤ 35
        System.out.println("ceiling(35):"+treeSet.ceiling(35));//≥ 35
        
        // === 3. VIEW OPERATIONS ===
        System.out.println("\n=== VIEWS ===");
        System.out.println("headSet(40): " + treeSet.headSet(40));         // < 40
        System.out.println("headSet(40, true): " + treeSet.headSet(40, true));  // ≤ 40
        System.out.println("tailSet(60): " + treeSet.tailSet(60));          // ≥ 60
        System.out.println("tailSet(60, false): " + treeSet.tailSet(60, false)); // > 60
        System.out.println("subSet(30, 70): " + treeSet.subSet(30, 70));    // 30 ≤ x < 70
        System.out.println("subSet(30, true, 70, true): " + 
                          treeSet.subSet(30, true, 70, true)); // 30 ≤ x ≤ 70
        
     // === 4. ITERATION OPERATIONS ===
        System.out.println("\n=== ITERATION ===");
        System.out.print("Ascending: ");
        for(int num:treeSet) {
        	System.out.print(num+" ");
        }
        
        System.out.print("\nDescendingSet: ");
        NavigableSet<Integer> descSet=treeSet.descendingSet();
        for(int num:descSet) {
        	System.out.print(num+" ");
        }
        System.out.print("\nDescendingIterator: ");
        Iterator<Integer> descIterator=treeSet.descendingIterator();
        while(descIterator.hasNext()) {
        	System.out.print(descIterator.next()+" ");
        }
     // === 5. REMOVAL OPERATIONS ===
        System.out.println("\n\n=== REMOVAL ===");
        System.out.println("remove(40): " + treeSet.remove(40));
        System.out.println("pollFirst(): " + treeSet.pollFirst());
        System.out.println("pollLast(): " + treeSet.pollLast());
        System.out.println("After removals: " + treeSet);
        
     // Remove range using view
        treeSet.subSet(30, 60).clear();
        System.out.println("After subSet clear:"+treeSet);
	}
}
