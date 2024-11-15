package Basics1;

import java.util.Scanner;

public class Areas {
	public static double circle(double r) {
		double circle=3.14*r*r;
		return circle;
	}
	public static int triangle(int l, int b, int h) {
		double triangle=l*b*h;
		return (int) triangle;//down casting or explicit casting
	}
	public static double rectangle(int l, int b) {
		double rectangle=l*b;
		return rectangle;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length:");
		int l=sc.nextInt();
		System.out.println("Enter the breadth:");
		int b=sc.nextInt();
		System.out.println("Enter the height:");
		int h=sc.nextInt();
		System.out.println("Enter the radius:");
		double r=sc.nextDouble();
		double area= circle(r);
		System.out.println("Area of circle:"+area);
		int area2=triangle(l,b,h);
		System.out.println("Area of triangle:"+area2);
		double area3=rectangle(l,b);
		System.out.println("Area of rectangle:"+area3);
		sc.close();
		
	}

}
