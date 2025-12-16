package ArrayList2;

import java.util.ArrayList;

public class Pro2 {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Ajay");
		System.out.println("Initial list of elements:"+al);
		//Adding elements to the end of the list
		al.add("Rahul");
		System.out.println(al);
		al.add(1,"Gaurav");
		System.out.println(al);
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("Sonoo");
		al2.add("Hanumant");
		al.addAll(al2);
		System.out.println("Adding second list "
				+ "element to the first list:"+al);
		ArrayList<String> al3=new ArrayList<String>(al2);
		al.addAll(1, al3);
		System.out.println(al);
		al.remove("Ajay");
		System.out.println(al);
		ArrayList<String>al4=new ArrayList<String>();
		al4.add("Raj");
		al4.add("Kision");
		al4.add("Shyam");
		al4.add("Kaira");
		al.addAll(al4);
		System.out.println(al);
		al.retainAll(al4);
		System.out.println("After retaining:"+al);
		al.removeIf(str->str.contains("Raj"));
		System.out.println(al);
	}
}
