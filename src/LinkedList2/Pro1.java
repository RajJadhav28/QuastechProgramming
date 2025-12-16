package LinkedList2;

import java.util.LinkedList;
import java.util.Scanner;

public class Pro1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList<String> list=new LinkedList<String>();
		System.out.println("Enter the size of linkedlist:");
		int count=sc.nextInt();
		System.out.println("Enter the elements:");
		for(int i=0;i<count;i++) {
			list.add(sc.next());
		}
		System.out.println(list);
		sc.close();
	}
}
