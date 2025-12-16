package ArrayList2;

import java.util.ArrayList;
import java.util.Scanner;

public class Pro5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		System.out.println("Enter the size of array list:");
		int count=sc.nextInt();
		System.out.println("Enter the elements:");
		for(int i=0;i<count;i++) {
			numbers.add(sc.nextInt());
		}
		System.out.println("Sorted array:");
		System.out.println();
	}
}
