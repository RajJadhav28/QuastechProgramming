package Basics1;

import java.util.Scanner;

public class EvenOdd {
	public static int oddeven(int num) {
		if(num%2==0) {
			System.out.println("Even number");
			
		}else if(num%2!=0){
			System.out.println("Odd number");
			
		}else {
			System.out.println("Invalid!!!");
		}
		return num;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter the value:");
			int num=sc.nextInt();
			int result=oddeven(num);
			System.out.println(result);
		}catch(Exception e) {
			System.out.println("Invalid!!!");
		}
		

	}

}
