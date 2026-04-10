package Set;

import java.nio.file.FileVisitResult;
import java.util.HashSet;
import java.util.Iterator;

public class Pro4 {
	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		
		System.out.println("=== HASHSET OPERATIONS ===\n");
        
        // Add elements
		System.out.println("1. Adding elements:");
		set.add("Apple");
		set.add("Banana");
        set.add("Orange");
        set.add("Apple");  // Duplicate - won't be added
        set.add("Mango");
        System.out.println("HashSet:"+set);
        System.out.println("Size:"+set.size());
        
     // Check existence
        System.out.println("\n2. Checking elements:");
        System.out.println("Contains 'Banana'? "+set.contains("Banana"));
        System.out.println("Contains 'Grapes'? "+set.contains("Grapes"));
        
     // Remove elements
        System.out.println("\n3. Removing elements:");
        System.out.println("Remove 'Oranges': "+set.remove("Orange"));
        System.out.println("Remove 'Grapes': "+set.remove("Grapes"));
        System.out.println("HashSet after removal:"+set);
        
        //Iterate through HashSet
        System.out.println("\n4. Iterating through HashSet:");
        System.out.println("Elements: ");
        for(String fruit: set) {
        	System.out.println(fruit+" ");
        }
        
        System.out.println("\n\n5. Using Iterator:");
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()) {
        	String fruit=iterator.next();
        	if(fruit.startsWith("A")) {
        		iterator.remove();
        	}
        }
        System.out.println("After removing elements starting with 'A': "+set);
        
        //Clear set
        System.out.println("\n6. Clearing set:");
        set.clear();
        System.out.println("HashSet after clear:"+set);
        System.out.println("Is empty? "+set.isEmpty());
	}
}
