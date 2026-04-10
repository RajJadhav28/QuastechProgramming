package ArrayList4;

import java.util.ArrayList;

public class Pro4 {
	public static void main(String[] args) {
		ArrayList<String> fruits=new ArrayList<String>();
		
		//Add elements
		fruits.add("Apple");
		fruits.add("Annar");
		fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Banana");//Duplicate
        
        System.out.println("Fruits list:"+fruits);
        
        //1.Checking if the element exists(contains)
        System.out.println("=== 1. Using contains() ===");
        String searchFruits="Mango";
        if(fruits.contains(searchFruits)) {
        	System.out.println(searchFruits+" conatins in the list");
        }else {
        	System.out.println("does not conatins.");
        }
        
        // 2. Find first occurrence index (indexOf)
        System.out.println("\n=== 2. Using indexOf() ===");
        String fruitToFind="Banana";
        int firstIndex=fruits.indexOf(fruitToFind);
        if(firstIndex!=-1) {
        	System.out.println("found at index:"+firstIndex);
        }
     // 3. Find last occurrence index (lastIndexOf)
        System.out.println("\n=== 3. Using lastIndexOf() ===");
        int lastIndex=fruits.lastIndexOf(fruitToFind);
        if(lastIndex!=-1) {
        	System.out.println("last index:"+lastIndex);
        }
        
     // 5. Manual linear search (for custom conditions)
        System.out.println("\n=== 5. Manual Linear Search ===");
        String searchFor="Banana";
        int foundIndex=-1;
        for(int i=0;i<fruits.size();i++) {
        	if(fruits.get(i).equals(searchFor)) {
        		foundIndex=i;
        		break;// Stop at first occurrence
        	}
        }
        if(foundIndex!=-1) {
        	System.out.println("found at index:"+foundIndex);
        }
        
        System.out.println("\n=== 6. Search with Condition ===");
        System.out.println("Fruits starting with 'A':");
        for(String fruit:fruits) {
        	if(fruit.startsWith("A")) {
        		System.out.println("-"+fruit);
        	}
        }
     // 8. Find all occurrences manually
        System.out.println("\n=== 8. Find All Occurrences ===");
        ArrayList<String> allbananaIndices=new ArrayList<String>();
        for(int i=0;i<fruits.size();i++) {
        	if(fruits.get(i).equals("Banana")) {
        		allbananaIndices.add("Index:"+i);
        	}
        }
        System.out.println(allbananaIndices);
        
        System.out.println("\n===9.Case-Insensitive Search===");
        String searchWord="Banana";
        int foundIgnoreCase=-1;
        for(int i=0;i<fruits.size();i++) {
        	if(fruits.get(i).equalsIgnoreCase(searchWord)) {
        		foundIgnoreCase=i;
        		break;
        	}
        }
        if(foundIgnoreCase!=-1) {
        	System.out.println("found at index:"+foundIgnoreCase);
        }
        
        }
}
