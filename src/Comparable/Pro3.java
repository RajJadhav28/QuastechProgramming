package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
	int rollno;
	String name, address;
	public Student(int rollno, String name, String address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
	}
}
class SortByRoll implements Comparator<Student>{
	@Override
	public int compare(Student a, Student b) {
		// TODO Auto-generated method stub
		return a.rollno-b.rollno ;
	}
}
class SortByName implements Comparator<Student>{
	@Override
	public int compare(Student a, Student b) {
		// TODO Auto-generated method stub
		return a.name.compareTo(b.name);
	}
}
public class Pro3 {
	public static void main(String[] args) {
		ArrayList<Student>ar=new ArrayList<Student>();
		ar.add(new Student(222, "bbb", "london"));
		ar.add(new Student(242, "aaa", "london"));
		ar.add(new Student(121, "ccc", "london"));
		
		System.out.println("Unsorted");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		Collections.sort(ar, new SortByRoll());
		System.out.println("Sort by rollno:");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		Collections.sort(ar, new SortByName());
		System.out.println("Sort by name:");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
	}

}
