package Basics1;

import java.util.Scanner;

class recatangle{
	public static double area(double r) {
		double area=3.14*r*r;
		return area;
	}
}
public class Areas2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		recatangle obj =new recatangle();
		System.out.println("Enter the radius of circle:");
		double r=sc.nextDouble();
		double result=recatangle.area(r);
		System.out.println(result);

	}

}
