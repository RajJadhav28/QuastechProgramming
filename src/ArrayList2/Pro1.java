package ArrayList2;

import java.util.ArrayList;
import java.util.Collections;

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
		int elements=list.get(0);
		System.out.println(elements);
		
		list.add(1,1);
		System.out.println(list);
		
		list.set(0, 5);
		System.out.println(list);
		
		int size=list.size();
		System.out.println(size);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("Sorted elements:");
		Collections.sort(list);
		System.out.println(list);
		
	}
}
