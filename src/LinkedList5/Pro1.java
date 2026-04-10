package LinkedList5;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Pro1 {
	public static void main(String[] args) {
		LinkedList<String>ll=new LinkedList<String>();
		ll.add("Aadil");
		ll.add("Mustafa");
		ll.add("Sharjeena");
		ll.add("Faizal");
		System.out.println(ll);
		ll.addFirst("Raj");
		ll.addLast("Jay");
		System.out.println(ll);
		ll.removeIf(str->str.contains("Aadil"));
		System.out.println(ll);
		ll.set(1, "Nitin");
		System.out.println(ll);
		System.out.println(ll.get(1));
		ll.set(1, "Guddu");
		System.out.println(ll);
		LinkedList<String> al2=(LinkedList<String>)ll.clone();
		System.out.println(al2);
		System.out.println(al2.indexOf("Raj"));
		System.out.println("==============================");
		Iterator<String> itr2=ll.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		System.out.println("==============================");
		Iterator<String> itr=ll.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("==============================");
		Collections.sort(ll);
		System.out.println(ll);
		Collections.sort(ll, Collections.reverseOrder());
		System.out.println(ll);
		
	}
}
