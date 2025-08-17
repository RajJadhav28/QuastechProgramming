package ArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pro1 {

	public static void main(String[] args) {
		Deque<String>dq=new ArrayDeque<String>();
		dq.add("Ravi");
		dq.add("Vijay");
		dq.add("Ajay");
		dq.add("Ramesh");System.out.println(dq);
		for(String str:dq) {
			System.out.println(str);
		}
		dq.pollLast();
		dq.pollFirst();
		System.out.println("After pollLast traversal...");
		for(String s:dq) {
			System.out.println(s);
		}

	}

}
