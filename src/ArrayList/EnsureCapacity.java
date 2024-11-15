package ArrayList;

import java.util.ArrayList;

public class EnsureCapacity {
	public static void main(String args[]) throws Exception{
		try {
			ArrayList<Integer> arrlist=new ArrayList<Integer>();
			arrlist.add(10);
			arrlist.add(20);
			arrlist.add(30);
			arrlist.add(40);
			arrlist.add(50);
			System.out.println("Index of elements:");
			for(Integer value:arrlist) {
				System.out.println(value);
				//System.out.println(" ");
			}
			int pos=arrlist.indexOf(30);
			boolean pos1=arrlist.isEmpty();
			System.out.println("ArrayList is empty:"+pos1);
			System.out.println("\n The element 3 is at index:"+pos);
			System.out.println("ArrayList:"+arrlist);
			arrlist.ensureCapacity(5000);
			System.out.println("Array list can surely store upto 5000 elements.");
		}catch(Exception e) {
			System.out.println("Exception thrown:"+e);
		}
	}

}
