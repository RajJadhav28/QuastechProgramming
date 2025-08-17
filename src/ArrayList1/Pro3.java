package ArrayList1;

import java.util.ArrayList;
import java.util.Iterator;

public class Pro3 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Apple");
		al.add("Mango");
		al.add("Grapes");
		al.add("Oranges");
		System.out.println("ArrayList elements:"+al);
		System.out.println("Traversing using foreach loop:");
		for(String fruit:al) {
			System.out.println(fruit);
		}
		System.out.println("Traversing using for loop:");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("Traversing using while loop:");
		Iterator it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		ArrayList<String>al2=(ArrayList<String>)al.clone();
		System.out.println("Clones to another object:"+al2);
		System.out.println("sublist"+al.subList(1, 3));
		

	}

}
