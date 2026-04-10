package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Pro2 {
	public static void main(String[] args) {
		Queue<String> queue=new LinkedList<String>();
		
		// === 1. ADD/INSERT OPERATIONS ===
        System.out.println("=== ADD/INSERT ===");
        queue.add("A");
        queue.offer("B");
        queue.add("C");
        queue.offer("D");
        System.out.println("Queue:"+queue);
        
       
	}
}
