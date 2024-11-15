package Basics1;

import java.util.Scanner;

public class FibonacciSeries {
	public static int fibonacci(int num) {
		int n1=0,n2=1,n3=0;
		System.out.print(n1+" "+n2);
		for(int i=2;i<num;i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		
		return n3;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			
			System.out.println("Enter the value:");
			int num=sc.nextInt();
			if(num<0) {
				System.out.println("Negative nmbers not allowed");
				return;
				
			}
			
			int result=fibonacci(num);
			//System.out.println(result);
		}catch(Exception e){
			System.out.println("Invalid!!!");
		}
		sc.close();

	}

}
