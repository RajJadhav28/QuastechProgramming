package Basics1;

import java.util.Scanner;

public class Palandrome {
	public static int palandrome(int num) {
		int sum=0,rem;
		while(num>0) {
		 rem=num%10;
		 sum=sum*10+rem;
		num=num/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value:");
		int num=sc.nextInt();
		int result=palandrome(num);
		int temp=num;
		if(result==temp) {
			System.out.println("Palandrome");
		}else {
			System.out.println("Not a Palandrome");
		}
		sc.close();
	}

}
