package Basics1;

import java.util.Scanner;

public class StrongNumber {
	public static int factorial(int num) {
		int f=1;
		for(int i=1;i<=num;i++) {
			f=f*i;
		}
		return f;
	}
	public static int strong(int num) {
		int sum=0, rem;
		while(num>0) {
			rem=num%10;
			sum=sum+factorial(rem);
			num=num/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check strong number:");
		int num=sc.nextInt();
		System.out.println("Enter the number till you want to find strongnumber");
		int n=sc.nextInt();
		int temp=num;
		int result=strong(num);
		
		if(result==temp) {
			System.out.println(+num+" is a Strong number");
		}else {
			System.out.println(num+" is Not strong number");
		}
		System.out.println("Strong from 1--"+n);
		for(int i=1;i<=n;i++) {
			int result1=strong(i);
			
		if(result1==i) {
			
			System.out.println("Strong number:"+i);
			}
		}
		sc.close();
		}
	
}

		

	


