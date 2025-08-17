package ArrayList1;

import java.util.ArrayList;

public class Pro2 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Ajay");
		System.out.println("Initial list of elements:"+al);
		al.add("Rahul");
		System.out.println("Add method:"+al);
		al.add(1,"Gaurav");
		System.out.println("Added at 1st position:"+al);
		ArrayList<String>al2=new ArrayList<String>();
		al2.add("Sanoo");
		al2.add("Hanumant");
		System.out.println("Second list element:"+al2);
		al.addAll(al2);
		System.out.println("Added second list element to first:"+al);
		ArrayList<String> al3=new ArrayList<String>(al2);
		al.addAll(1, al3);
		System.out.println("Added third list elements to first list at specified(1st) position:"+al);
		al.remove("Ajay");
		System.out.println(al);
		al.remove(0);
		System.out.println(al);
		al.addAll(al3);
		System.out.println(al);
		al.removeAll(al2);
		System.out.println(al);

	}

}
