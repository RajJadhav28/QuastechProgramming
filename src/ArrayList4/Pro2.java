package ArrayList4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;



public class Pro2 {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		list.set(0, 6);// first position 6 will be placed
		System.out.println(list);
		
		System.out.println("using Iterator:");
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println("\nUsng list iterator to reverse the list:");
		ListIterator<Integer> list1= list.listIterator(list.size());
		while(list1.hasPrevious()) {
			System.out.print(list1.previous()+" ");
		}
		System.out.println("\nUsng list iterator:");
		while(list1.hasNext()) {
			System.out.print(list1.next()+" ");
		}
		 ArrayList<Integer> al=(ArrayList<Integer>)list.clone();
		 System.out.println("\nCloned array:"+al);
		 Iterator<Integer> itr2=list.iterator();
		 System.out.println("name1:"+itr2.next());
		 System.out.println("Remaining values:");
		 itr2.forEachRemaining(a->{System.out.println(a);});
	}
}
