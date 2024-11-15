package LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class Pro3 {
	public static void main(String args[]) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Geeks");
		ll.add("For");
		ll.add("Geeks");
		System.out.println("LinkedList:"+ll);
		ListIterator list_Itr=ll.listIterator();
		while(list_Itr.hasNext()) {
			System.out.println(list_Itr.next());
		}
		System.out.println("Head of the list:"+ll.peek());
		System.out.println(ll.peekFirst());
		System.out.println(ll);
		//System.out.println("peeklast:"+ll.peekLast());
		//System.out.println(ll.poll());
		System.out.println("ll.poolFirst:"+ll.pollFirst());
		System.out.println(ll.poll());
		System.out.println(ll.pollLast());
		
	}

}
