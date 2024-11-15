package Basics1;

import java.util.Scanner;

public class PrimeNumber {
	public static int primenumber(int n) {
		int m=n/2,flag=0;
		if(n==0||n==1) {
			System.out.print("Not a prime numer:");
		}else {
			for(int i=2;i<=m;i++) {
				if(n%i==0) {
					System.out.print("Not a prime number:");
					flag=1;
					break;
				}
			}
		}
		if(n<0) {
			System.out.println("Please enter a positive number");
			System.out.print("Negative number:");
			return n;
			
			
		}
		if(flag==0) {
			System.out.print("prime number:");
		}
		return n;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter the number to be checked:");
		int n=sc.nextInt();
		int result=primenumber(n);
		System.out.print(result);
		}catch(Exception e) {
			System.out.println("Invalid input!!!");
		}

	}

}
