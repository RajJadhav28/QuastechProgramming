package ArrayList4;

import java.util.ArrayList;
import java.util.Iterator;

public class Pro6 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Mango");
        list.add("Grapes");
        list.add("Banana");
        list.add("Kiwi");
		        
		System.out.println("Fruits Original list:"+list);
		        
		// 1. Remove by index
		System.out.println("=== 1. Remove by index (remove index 2) ===");
		String removed=list.remove(2);
		System.out.println("Removed element:"+removed);
		System.out.println("List after removal:"+list);
		
		// 2. Remove by value (first occurrence)
        System.out.println("\n=== 2. Remove by value (remove 'Banana') ===");
        boolean isRemoved=list.remove("Banana");
        System.out.println("Was 'Banana' removed:"+isRemoved);
        System.out.println("List after removal:"+list);
        
     // 3. Remove all occurrences of a value
        System.out.println("\n=== 3. Remove all occurrences manually ===");
        ArrayList<String> newList=new ArrayList<String>();
        for(String fruit:list) {
        	if(!fruit.equals("Banana")) {
        		newList.add(fruit);
        	}
        }
        list=newList;
        System.out.println("List after removing all 'Banana':"+list);
        
     // 4. Remove using Iterator
        System.out.println("\n=== 4. Remove using Iterator ===");
        list.add("Watermelon");
        list.add("Pineapple");
        System.out.println("Before iterator removal:"+list);
        
        Iterator<String> iterator=list.iterator();
        while(iterator.hasNext()) {
        	String fruit=iterator.next();
        	if(fruit.startsWith("M")) {
        		iterator.remove();
        	}
        }
        System.out.println("After removing fruits starting with 'M': " + list);
     // 5. Remove range (using subList)
        System.out.println("\n=== 5. Remove range (indices 1 to 3) ===");
        list.add("Cherry");
        list.add("Berry");
        list.add("Peach");
        System.out.println("Before range removal:"+list);
        System.out.println(list.subList(1, 4));
        list.subList(1, 4).clear();
        System.out.println(list);
        
     // 6. Remove all elements
        System.out.println("\n=== 6. Remove all elements ===");
        list.clear();
        System.out.println("List after clear():"+list);
        System.out.println("Is list empty?"+list.isEmpty());
	}
}
