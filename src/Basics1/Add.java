package Basics1;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		double a=sc.nextDouble();
		System.out.println("Enter the value of b:");
		double b=sc.nextDouble();
		double c=Math.pow(a, 2)+2*a*b+Math.pow(b, 2);
		System.out.println("Value:"+c);
		sc.close();

	}

}
