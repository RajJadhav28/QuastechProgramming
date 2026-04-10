package Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Pro6 {
	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		
		// === 1. ADDITION OPERATIONS ===
        System.out.println("=== ADDITION ===");
        System.out.println(set.add("A"));
        System.out.println(set.add("B"));
        System.out.println(set.add("A"));//duplicate
        set.addAll(List.of("C","D","E"));
        System.out.println("Set:"+set);
        
     // === 2. CHECK OPERATIONS ===
        System.out.println("\n=== CHECK ===");
        System.out.println("contains('B'):"+set.contains("B"));
        System.out.println("contains('X'):"+set.contains("X"));
        System.out.println("containsAll([A,C]):"+set.containsAll(List.of("A","C")));
        System.out.println("isEmpty():"+set.isEmpty());
        System.out.println("size():"+set.size());
        
     // === 3. ITERATION OPERATIONS ===
        System.out.println("\n=== ITERATION ===");
        System.out.print("Enhanced for: ");
        for(String item:set) {
        	System.out.print(item+" ");
        }
        System.out.println("\nIterator:");
        Iterator<String> iterator=set.iterator();
        while(iterator.hasNext()) {
        	System.out.print(iterator.next()+" ");
        }
     // === 4. REMOVAL OPERATIONS ===
        System.out.println("\n\n=== REMOVAL ===");
        System.out.println(set.remove("C"));
        System.out.println(set.remove("X"));
        
     // Remove with iterator
        Iterator<String> iterator1=set.iterator();
        System.out.println("Remove with iterator:");
        while(iterator1.hasNext()) {
        	if(iterator1.next().equals("D")) {
        		iterator1.remove();
        	}
        }
        System.out.println("After iterator remove:"+set);
        
     // === 5. BULK OPERATIONS ===
        System.out.println("\n=== BULK OPERATIONS ===");
        HashSet<String> set2=new HashSet<String>(List.of("E","F","G"));
        
       //union
        set.addAll(set2);
        System.out.println("Union (addAll):"+set);
        
        //Intersection
        set.retainAll(List.of("A","E","F"));
        System.out.println("Insertion (retainAll):"+set);
        
     // Difference
        set.removeAll(List.of("F"));
        System.out.println("Difference (removalAll):"+set);
        
     // === 6. SET COMPARISON ===
        System.out.println("\n=== SET COMPARISON ===");
        HashSet<String> set3=new HashSet<String>(List.of("A","E"));
        System.out.println("equals(set3):"+set.equals(set3));
        System.out.println("hashCode():"+set.hashCode());
        
        // === 7. CONVERSION OPERATIONS ===
        System.out.println("\n=== CONVERSION ===");
        Object[] array=set.toArray();
        String strArray[]=set.toArray(new String[0]);
        System.out.println("Array:"+Arrays.toString(strArray));
        
     // === 8. CLEARING ===
        System.out.println("\n=== CLEARING ===");
        set.clear();
        System.out.println("After clear:"+set);
        System.out.println("size():"+set.size());
        System.out.println("isEmpty():"+set.isEmpty());
        
     // === 9. PERFORMANCE OPERATIONS ===
        System.out.println("\n=== PERFORMANCE ===");
        HashSet<String> largest=new HashSet<String>(100);
        largest.add("Test");
        System.out.println("Initial capacity constructor used");
        
     // === 10. NULL HANDLING ===
        System.out.println("\n=== NULL HANDLING ===");
        set.add(null);
        set.add(null); // only one null allowed
        System.out.println("Set with null: " + set);
        System.out.println("contains(null): " + set.contains(null));
	}
}
