package ArrayList4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pro1 {
	public static void main(String[] args) {
		List<String> al=new ArrayList<String>();
		al.add("Ajay");
		al.add("Rahul");
//		al.add(null);
		System.out.println(al);
		al.add(1,"Gaurav");
		System.out.println(al);
		List<String> al2=new ArrayList<String>();
		al2.add("Sonu");
		al2.add("Hanumant");
		al.addAll(al2);
		System.out.println(al);//Adding second list element to first list
		 List<String> al3=new ArrayList<String>();
		 al.addAll(1,al2);
		 System.out.println(al);// Addind second list elements to the first list 
		 //at specific position
		 al.remove("Ajay");
		 System.out.println(al);
		 al.retainAll(al);
		 System.out.println("After retaining:"+al);
		 al.removeIf(str->str.contains("Raj"));
		 System.out.println(al);
		 List<String> al5=Arrays.asList("Raj", "Shyam");
		 System.out.println(al5);
	}
}
