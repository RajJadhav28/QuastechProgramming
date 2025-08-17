package LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Pro1 {
	public static void main(String[] args) {
		LinkedHashSet<String>set=new LinkedHashSet<String>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		Iterator it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
