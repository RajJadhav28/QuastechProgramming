package ArrayList3;

import java.util.ArrayList;
import java.util.Iterator;

import ArrayList.ListIterator;

public class Pro1 {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println(list);
		list.set(0, 6);
		System.out.println(list);
		
		System.out.println("using Itereator");
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		java.util.ListIterator<Integer> list1=list.listIterator(list.size());
		Iterator<Integer> itr2=list.iterator();
		while(list1.hasPrevious()) {
			System.out.print(list1.previous()+" ");
		}
		
	}
}
