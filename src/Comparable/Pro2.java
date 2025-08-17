package Comparable;

import java.util.ArrayList;
import java.util.Collections;

class Employees implements Comparable<Employees>{
	int empid;
	String name;
	public Employees(int empid, String name) {
		super();
		this.empid = empid;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employees [empid=" + empid + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Employees std) {
		// TODO Auto-generated method stub
		return this.empid-std.empid;
	}
}
public class Pro2 {

	public static void main(String[] args) {
		ArrayList<Employees>list=new ArrayList<Employees>();
		list.add(new Employees(2, "Boman"));
		list.add(new Employees(1,"Abram"));
		list.add(new Employees(3,"Kartiki"));
		System.out.println("Before sorting:");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		Collections.sort(list);
		System.out.println("After sorting:");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
