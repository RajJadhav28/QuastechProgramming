package Basics1;

import java.util.Scanner;

public class Area_of_Triangle {
	public static int area(int l, int b) {
		int area=l*b;
		return area;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length:");
		int l=sc.nextInt();
		System.out.println("Enter the breadth:");
		int b=sc.nextInt();
		int result=area(l,b);
		//System.out.println("Area of rectangle:"+area(l, b));
		System.out.println("Area of rectangle:"+result);
		sc.close();

	}

}
