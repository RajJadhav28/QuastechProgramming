package Basics;
import java.util.*;

public class AreaOfCircle {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int r;
		System.out.println("Enter the value of radius:");
		r=sc.nextInt();
		double ar=3.14*r*r;
		System.out.println("Area of circle:"+ar);
		sc.close();
		
		int p=800,r1=25,t=3;
		int s=(p*r1*t)/100;
		System.out.println("Simple Interest:"+s);
		
		
				}

}
