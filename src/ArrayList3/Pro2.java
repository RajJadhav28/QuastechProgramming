package ArrayList3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Pro2 {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		for(int num:list) {
			System.out.print(num+" ");
		}
		System.out.println("\n===========");
		list.forEach(a->{System.out.print(a+" ");});
		
		System.out.println("\n===========");
		List<Integer> num=Arrays.asList(4,5,6,7,8,9);
		num.forEach(a->{System.out.print(a+" ");});
		
		System.out.println("\n===========");
		int element=list.get(0);
		System.out.println(element);
		
		list.set(0, 5);
		System.out.println(list);
		
		int size=list.size();
		System.out.println("size of array:"+size);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		Collections.sort(list);
		System.out.println(list);
	}
}
