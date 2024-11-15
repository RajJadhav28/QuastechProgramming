package Basics1;

import java.util.Scanner;

public class Armstrong {
	public static int armstrong(int num) {
		int sum=0;
		int rem;
		while(num>0) {
			rem=num%10;
			sum=sum+rem*rem*rem;
			num=num/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter the num:");
		int num=sc.nextInt();
		
		int result=armstrong(num);
		int temp=num;
		if(result==temp) {
			System.out.println("Armstrong number");
		}else {
			System.out.println("Not an armstrong number");
		}
		}catch(Exception e) {
			System.out.println("Invalid!!!");
		}
		sc.close();

	}

}
