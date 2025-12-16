package LinkedList2;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Pro2 {
	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Aadil");
		ll.add("Mustafa");
		ll.add("Sharjeena");
		ll.add("Faizal");
		System.out.println(ll);
		
		ll.addFirst("Raj");
		System.out.println(ll);
		ll.addLast("Jay");
		System.out.println(ll);
//		ll.removeFirstOccurrence("Aadil");
//		System.out.println(ll);
		ll.removeIf(str->str.contains("Aadil"));
		System.out.println(ll);
		System.out.println("Before updates:"+ll.get(1));
		ll.set(1, "Nitin");
		System.out.println(ll);
		System.out.println("First element:"+ll.getFirst());
		System.out.println("Last element:"+ll.getLast());
		System.out.println(ll.contains("Raj"));
		
		LinkedList<String> al2=(LinkedList<String>)ll.clone();
		System.out.println("After cloning:"+al2);
		System.out.println(al2.indexOf("Raj"));
		System.out.println(al2.remove(1));
		System.out.println(al2);
		System.out.println(al2.removeFirst());
		System.out.println(al2.removeLast());
		for(int i=0;i<al2.size();i++) {
			System.out.println(al2.get(i));
		}
		System.out.println("===================");
		System.out.println("Using Iterator:");
		Iterator<String> itr=ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("====================");
		Iterator itr2=ll.descendingIterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		System.out.println("=================");
		ll.forEach(a->{
			System.out.println(a);
		});
		System.out.println("=====================");
		Iterator itr3=ll.listIterator();
		while(itr3.hasNext()) {
			System.out.println(itr3.next());
		}
		Collections.sort(ll);
		System.out.println(ll);
		
		Collections.sort(ll, Collections.reverseOrder());
		System.out.println("Descending:"+ll);
	}
}
