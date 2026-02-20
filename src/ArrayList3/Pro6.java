package ArrayList3;

import java.util.ArrayList;
import java.util.Iterator;

public class Pro6 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		// Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Mango");
        list.add("Grapes");
        list.add("Banana");
        list.add("Kiwi");
        
        System.out.println("Original List:"+list);
        
     // 1. Remove by index
        System.out.println("=== 1. Remove by index (remove index 2) ===");
        String remove=list.remove(2);
        System.out.println("Removed element:"+remove);
        System.out.println("list after removing element:"+list);
        
     // 2. Remove by value (first occurrence)
        System.out.println("\n=== 2. Remove by value (remove 'Banana') ===");
        boolean isRemove=list.remove("Banana");
        System.out.println("was banana removes:"+isRemove);
        System.out.println("After removing the element:"+list);
        
        // 3. Remove all occurrences of a value
        System.out.println("\n=== 3. Remove all occurrences manually ===");
        ArrayList<String> toRemove=new ArrayList<String>();
        toRemove.add("Banana");
        
        //// Create new list without 'Banana'
        ArrayList<String> newList=new ArrayList<String>();
        for(String fruit:list) {
        	if(!fruit.equals("Banana")) {
        		newList.add(fruit);
        	}
        }
        list=newList;
        System.out.println("List after removing all Banana:"+list);
        
        // 4. Remove using Iterator
        
        Iterator<String> itr=list.iterator();
        while(itr.hasNext()) {
        	if(itr.next().startsWith("M")) {
        		itr.remove();
        	}	
        }
        System.out.println("After removing elements starts with M:"+list);
        list.subList(1, 2).clear();
        System.out.println(list);
	}
}
