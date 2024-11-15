package ArrayList1;
import java.util.ArrayList;
import java.util.Iterator;

public class Pro1 {
	public static void main(String args[]) {
		//add elements
		ArrayList<Integer> arrlist= new ArrayList<Integer>();
		arrlist.add(15);
		arrlist.add(16);
		arrlist.add(17);
		arrlist.add(18);
		arrlist.add(19);
		arrlist.add(20);
		
		//without iterator
		System.out.println(arrlist);
		
		//with iterator
		Iterator itr=arrlist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		ArrayList<Integer> arrlist2=new ArrayList<Integer>();
		arrlist2.add(21);
		arrlist2.add(22);
		arrlist2.add(23);
		arrlist2.add(24);
		arrlist2.add(25);
		
		arrlist.addAll(arrlist2);
		Iterator itr2=arrlist.iterator();
		System.out.println("Adding both the arraylists:");
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		//clear method
		arrlist2.clear();
		System.out.println("After using clear method on arrlist2:");
		System.out.println(arrlist2);
		int pos=arrlist.indexOf(16);
		System.out.println("position:"+pos);
		arrlist.remove(2);
		System.out.println("After remove method on 2nd position."+arrlist);
	}

}
