package ArrayList5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pro1 {
	public static void main(String[] args) {
		List<String> al=new ArrayList<String>();
		al.add("Ajay");
		al.add("Rahul");
		al.add(null);
		System.out.println(al);
		al.add(1,"Gaurav");
		System.out.println(al);
		List<String> al2=new ArrayList<String>();
		al2.add("Sonu");
		al2.add("Hanumant");
		System.out.println("list2:"+al2);
		al.addAll(al2);
		System.out.println("list 1&2 combined in list1:"+al);
		List<String> al3=new ArrayList<String>();
		al.addAll(1, al2);
		al.remove("Ajay");
		System.out.println(al);
		al.retainAll(al);
		System.out.println("al:"+al);
		System.out.println("al2:"+al2);
		al2.removeIf(str->str.contains("Sonu"));
		System.out.println("al2:"+al2);
		List<String> al5=Arrays.asList("Raj","Shyam");
		System.out.println(al5);
	}
}
