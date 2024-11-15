package Basics1;

import java.util.Scanner;

public class Cube {
	public static double area(double a, double b) {
		double area=Math.pow(a, 3)+3*Math.pow(a, 2)+b*3*a*Math.pow(b, 2)+Math.pow(b, 3);
		return area;
	}

	public static void main(String[] args) throws ArithmeticException{
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter the value of a:");
			double a=sc.nextDouble();
			System.out.println("Enter the value of b:");
			double b=sc.nextDouble();
			double result=area(a,b);
			System.out.println("Area of cube:"+result);
			
		}catch(Exception e) {
			System.out.println("Invalid input!!!");
		}
		sc.close();

	}

}
