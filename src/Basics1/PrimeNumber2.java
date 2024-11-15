package Basics1;

import java.util.Scanner;

public class PrimeNumber2 {
	public static int prime(int n) {
		int m=n/2,flag=0;
		if(n==0||n==1) {
			System.out.print("Not a Prime number:");
			return n;
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
			System.out.println("Enter a Positive number.");
			System.out.println("Negative number:");
			return n;
		}
		if(flag==0) {
			System.out.println("Prime number:");
		}
		return n;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
//		System.out.println("Enter the number to check:");
//		
//		int n=sc.nextInt();
		
//		int result=prime(n);
//		System.out.print(result);
		
		System.out.println("Enter the number till you want to find prime number:");
		int n1=sc.nextInt();
		
		System.out.println("Prime number from 1 to :"+n1);
		for(int i=2;i<=n1;i++) {
			int result1=prime(i);
			if(result1==i) {
				System.out.println(result1);
			}
			
		}
		
		sc.close();
		}catch(Exception e) {
			System.out.println("Invalid!!!");
		}
	}
}
