package PriorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Pro1 {

	public static void main(String[] args) {
		PriorityQueue<String>pq=new PriorityQueue<String>();
		pq.add("Amit");
		pq.add("Namit");
		pq.add("Ajay");
		pq.add("Vijay");
		pq.add("Karan");
		//System.out.println("Head:"+pq.element());
		System.out.println("Head:"+pq.peek());
		System.out.println("Iterating the elements:");
		Iterator<String>itr=pq.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		pq.remove();
		pq.poll();
		System.out.println("After removing two elements:");
		Iterator<String>itr2=pq.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}

	}

}
