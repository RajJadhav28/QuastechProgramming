package ArrayList3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;



public class Pro4 {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Apple");
		al.add("Grapes");
		al.add("Banana");
		al.add("Oranges");
		al.add("Mango");
		System.out.println("ArrayList elements:"+al);
		System.out.println("          ");
		System.out.println("using iterator-");
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("================");
		 ListIterator<String> list1=al.listIterator(al.size());// Start at end
		 while(list1.hasPrevious()) {
			 System.out.println(list1.previous());
		 }
		 
		 ArrayList<String> al3=(ArrayList<String>)al.clone();
		 System.out.println(al3);
		 System.out.println(al.subList(1, 3));
		 
		 Iterator<String> itr2=al.iterator();
		 
		 System.out.println("name1:"+itr2.next());
		 System.out.println("Remaining fruits:");
		 itr2.forEachRemaining(a->{System.out.println(a);});
	}
}
