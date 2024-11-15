package Basics1;

import java.util.Scanner;

public class StrongNumber1 {
	public static int factorial(int num) {
		int f=1;
		for(int i=1;i<=num;i++) {
			f=f*i;
		}
		return f;
	}
	public static boolean isStrong(int num) {
		int sum=0;
		int temp=num;
		while(num>0) {
			int rem=num%10;
			sum=sum+factorial(rem);
			num=num/10;
		}
		return sum==temp;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter the value:");
		int num=sc.nextInt();
		if(isStrong(num)) {
			System.out.println(num+" is a strong number.");
		}else {
			System.out.println(num+" is not a strong number.");
		}
		}catch(Exception e) {
			System.out.println("Invalid!!!");
		}
		sc.close();

	}

}
