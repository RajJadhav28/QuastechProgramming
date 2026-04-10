package ArrayList5;

import java.util.ArrayList;

public class Pro3 {
	public static void main(String[] args) {
		ArrayList<String> fruits=new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Annar");
		fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Banana");//Duplicate
        System.out.println(fruits);
        if(fruits.contains("Mango")) {
        	System.out.println("contains");
        }else {
        	System.out.println("does not contains");
        }
		
        int firstIndex=fruits.indexOf("Banana");
        if(firstIndex!=-1) {
        	System.out.println(firstIndex);
        }
        int lastIndex=fruits.lastIndexOf("Banana");
        if(lastIndex!=-1) {
        	System.out.println(lastIndex);
        }
        System.out.println("====================");
        System.out.println("\n=== 5. Manual Linear Search ===");
        String searchFor="Banana";
        int foundIndex=-1;
        for(int i=0;i<fruits.size();i++) {
        	if(fruits.get(i).equals(searchFor)) {
        		foundIndex=i;
        		break;
        	}
        }
        if(foundIndex!=-1) {
        	System.out.println(foundIndex);
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
        ArrayList<String> allbananasIndices=new ArrayList<String>();
        for(int i=0;i<fruits.size();i++) {
        	if(fruits.get(i).equals("Banana")) {
        		allbananasIndices.add("Index:"+i);
        	}
        }
        System.out.println(allbananasIndices);
	}
}
