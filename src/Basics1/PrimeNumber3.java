package Basics1;

import java.util.Scanner;

public class PrimeNumber3 {
	public static boolean isPrime(int num) {
		int m=num/2,flag=0;
		if(num<=1) {
			return false;
		}else {
			for(int i=2;i<=m;i++) {
				if(num%i==0) {
					flag=1;
					return false;
				}
			}
		}
		if(flag==0) {
			return true;
		}
		return false;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int num=sc.nextInt();
		try {
			System.out.println("Prime numbers from 1 to "+num);
			for(int i=2;i<=num;i++) {
				if(isPrime(i)) {
					System.out.println(i);
				}
			}
		}catch(Exception n) {
			System.out.println("Invalid!!!");
		}
		sc.close();

	}

}
