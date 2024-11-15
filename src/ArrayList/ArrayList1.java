package ArrayList;
import java.io.*;
import java.util.*;

public class ArrayList1 {
	public static void main(String args[]) {
		System.out.println("Printing arraylist1:");
		ArrayList<Integer> arrlist1=new ArrayList<Integer>(5);
		arrlist1.add(10);
		arrlist1.add(22);
		arrlist1.add(33);
		arrlist1.add(44);
		for(Integer num:arrlist1) {
			System.out.println("Number:"+num);
		}
		System.out.println("Printing arraylist2:");
		ArrayList<Integer>arrlist2=new ArrayList<Integer>(5);
		arrlist2.add(25);
		arrlist2.add(35);
		arrlist2.add(45);
		arrlist2.add(55);
		for(Integer number:arrlist2) {
			System.out.println("Number:"+number);
		}
		System.out.println("Printing all the elements:");
		arrlist1.addAll(arrlist2);
			Iterator itr=arrlist1.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			System.out.println("ArrayList3:");
			ArrayList<Integer>arrlist3=new ArrayList<Integer>(4);
			arrlist3.add(1);
			arrlist3.add(2);
			arrlist3.add(3);
			arrlist3.add(4);
			arrlist3.add(5);
			System.out.println("Initial elements:"+arrlist3);
			arrlist3.clear();
			System.out.println("After clearing the elements:"+arrlist3);
	}
	
}
	


