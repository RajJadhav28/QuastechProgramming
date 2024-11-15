package Basics;
import java.util.*;

public class Print {
	
	public static int print(int a) {
		System.out.println(a);
		return a;
		}
	public static void printName(String name) {
		System.out.println(name);
		return;
	}
	public static int calculate(int a, int b) {
		System.out.println(a*b);
		return a*b;
	}
	public static int calculate1(int x, int y) {
		return x*y;
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		print(1);
		printName("raj");
		calculate(4, 2);
		System.out.println("Enter the value of x:");
		int x=sc.nextInt();
		System.out.println("Enter the value of y:");
		int y=sc.nextInt();
		System.out.println("Product of two numbers:"+calculate1(x,y));
		
	}

}
