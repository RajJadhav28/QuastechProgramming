package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterator extends ArrayList{
	public static void main(String args[]) throws Exception{
		try {
			ArrayList<String> arrlist=new ArrayList<String>();
			arrlist.add("Abhay");
			arrlist.add("Bobby");
			arrlist.add("Chand");
			arrlist.add("Dev");
			arrlist.add("Erivati");
			arrlist.removeIf(n->(n.charAt(0)=='D'));
			System.out.println("Name that does not starts with D:");
			for(String s:arrlist) {
				System.out.println(s);
			}
			System.out.println("Initial ArrayList:"+arrlist);
			Iterator itr=arrlist.iterator();
			System.out.println("Values after using iterator:");
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			System.out.println("Value from index position 2:");
			java.util.ListIterator<String> itr2=arrlist.listIterator(2);
			while(itr2.hasNext()) {
				System.out.println(itr2.next());
			}
			ArrayList<Integer> arrlist2=new ArrayList<Integer>();
			arrlist2.add(23);
			arrlist2.add(32);
			arrlist2.add(45);
			arrlist2.add(63);
			arrlist2.add(35);
			
			arrlist2.removeIf(n->(n%3==0));
			System.out.println("Value divided by 3:");
			for(int i:arrlist2) {
				System.out.println(i);
			}
			
			ArrayList<String> bags=new ArrayList<String>();
			bags.add("pen");
			bags.add("pencil");
			bags.add("paper");
			
			ArrayList<String> boxes=new ArrayList<String>();
			boxes.add("pen");
			boxes.add("pencil");
			boxes.add("penpencil");
			boxes.add("eraser");
			boxes.add("sharpner");
			
			System.out.println("Converting to array:");
			Object[] objects=boxes.toArray();
			for(Object obj:objects) {
				System.out.println(obj+" ");
			}
			
			List<String> sublist=boxes.subList(0, 3);
			System.out.println("Sublist:"+sublist);
			
			System.out.println("Bags contains:"+bags);
			System.out.println("Bags contains:"+boxes);
			
			boxes.retainAll(bags);
			System.out.println("After applying retainall to boxes.");
			System.out.println("Bags contains:"+bags);
			System.out.println("Bags contains:"+boxes);
			int size=bags.size();
			System.out.println("size:"+size);
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
