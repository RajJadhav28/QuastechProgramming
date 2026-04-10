package ArrayList5;

import java.util.ArrayList;
import java.util.Iterator;

public class Pro4 {
	public static void main(String[] args) {
		 ArrayList<String> list = new ArrayList<>();
		 
		// Add elements
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Orange");
	        list.add("Mango");
	        list.add("Grapes");
	        list.add("Banana");
	        list.add("Kiwi");
	        
	        System.out.println(list);
	        
	     // 1. Remove by index
	        System.out.println("=== 1. Remove by index (remove index 2) ===");
	        String remove=list.remove(2);
	        System.out.println(remove);
	        System.out.println(list);
	        
	     // 2. Remove by value (first occurrence)
	        System.out.println("\n=== 2. Remove by value (remove 'Banana') ===");
	        boolean isRemove=list.remove("Banana");
	        System.out.println(isRemove);
	        System.out.println(list);
	        
	     // 3. Remove all occurrences of a value
	        System.out.println("\n=== 3. Remove all occurrences manually ===");
	        ArrayList<String>toRemove=new ArrayList<String>();
	        toRemove.add("Banana");
	        
	     // Create new list without 'Banana'
	        ArrayList<String> newList = new ArrayList<>();
	        for(String fruit:list) {
	        	if(!fruit.equals("Banana")) {
	        		newList.add(fruit);
	        	}
	        }
	        list=newList;
	        System.out.println(list);
	     // 4. Remove using Iterator
	        System.out.println("\n=== 4. Remove using Iterator ===");
	        list.add("Watermelon");
	        list.add("Pineapple");
	        System.out.println("Before iterator removal: " + list);
	        Iterator<String> iterator=list.iterator();
	        while(iterator.hasNext()) {
	        	String fruit=iterator.next();
	        	if(fruit.startsWith("M")) {
	        		iterator.remove();
	        	}
	        }
	}
}
