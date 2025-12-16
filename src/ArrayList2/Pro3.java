package ArrayList2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;



public class Pro3 {
	public static void main(String[] args) {
		
	ArrayList<String>al=new ArrayList<String>();
	al.add("Apple");
	al.add("Grapes");
	al.add("Banana");
	al.add("Orange");
	al.add("Mango");
	System.out.println("ArrayList elements:"+al);
	System.out.println();
	System.out.println("Traversing element using forEach loop:");
	for(String fruit:al) {
		System.out.println(fruit);
	}
	System.out.println("Iterating elements using while loop:");
	Iterator<String>itr=al.iterator();
	while(itr.hasNext()) {
		System.out.print(itr.next()+" ");
	}
	ArrayList<String> al2=(ArrayList<String>)al.clone();
	System.out.println(al2);
	System.out.println(al.subList(1, 3));
	
	ListIterator<String> list1=al.listIterator(al.size());
	Iterator itr2=al.iterator();
	while(list1.hasPrevious()) {
		String str=list1.previous();
		System.out.println(str);
	}
	al.forEach(a->{
		System.out.println(a);
	});
	}
}
