package LinkedList;

import java.util.LinkedList;

public class Pro2 {
	public static void main(String args[]) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Geeks");
		ll.add("For");
		ll.add("Geeks");
		System.out.println(ll);
		System.out.println(ll.get(2));
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
	}

}
