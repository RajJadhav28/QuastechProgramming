package ArrayList5;

import java.util.ArrayList;

public class Pro2 {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		al.add("Jason");
		
		System.out.println(al);
		//Removing specific elements
		al.remove("Vijay");
		System.out.println(al);
		al.remove(0);
		System.out.println("al:"+al);
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("Ravi");
		al2.add("Hanumant");
		System.out.println("al2:"+al2);
		al.addAll(al2);
		System.out.println("al:"+al);
		//Removing all the new elements from arraylist
		al.removeAll(al2);
		System.out.println(al);
		al.removeIf(str->str.contains("Ajay"));
		System.out.println(al);
		al.clear();
		System.out.println(al);
		
	}
}
