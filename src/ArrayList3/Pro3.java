package ArrayList3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pro3 {
	public static void main(String[] args) {
//		List<String> al=Arrays.asList("Ajay, Rahul");
		//Arrays.asList() returns a fixed-size list that cannot be modified.
		List<String> al=new ArrayList<String>();
		al.add("Ajay");
		al.add("Rahul");
		System.out.println(al);
		al.add(1,"Gaurav");
		System.out.println(al);
		
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("Soonu");
		al2.add("Hanumant");
		al.addAll(al2);
		System.out.println(al);
		ArrayList<String> al3=new ArrayList<String>();
		al.addAll(1,al3);
		System.out.println(al);
		al.remove("Ajay");
		System.out.println(al);
		ArrayList<String> al4=new ArrayList<String>();
		al4.add("Raj");
		al4.add("Kishion");
		al4.add("Shyam");
		al4.add("Kaira");
		al.addAll(al4);
		System.out.println(al);
		
//		After al.retainAll(al4):
//		al keeps only elements that exist in al4
//		So al becomes: [Raj, Kishion, Shyam, Kaira]
		
		al.retainAll(al);
		System.out.println("After retaining:"+al4);
		al.removeIf(str->str.contains("Raj"));
		System.out.println(al);
		
	}
}
