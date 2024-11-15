package LinkedList;

import java.util.LinkedList;

public class Pro1 {
	public static void main(String args[]) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("B");
		ll.add("C");
		ll.add("D");
		System.out.println("1-"+ll);
		ll.addFirst("A");
		ll.addLast("E");
		System.out.println("2-"+ll);
	}

}
