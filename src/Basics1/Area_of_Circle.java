package Basics1;

import java.util.Scanner;

public class Area_of_Circle {
	public static double area(double r) {
		double area=3.14*r*r;
		return area;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of circle:");
		double r=sc.nextDouble();
		double result=area(r);
		System.out.println("Area of circle:"+result);
		double d=r*2;
		System.out.println("Diameter of circle:"+d);
		sc.close();

	}

}
