package Basics;
import java.util.*;

public class Methods {
	public static int add(int a, int b) {
		int sum=a+b;
		return sum;
	}
	public static void Name(String a) {
		System.out.println(a);
		return;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a=4;
		int b=5;
		int sum=add(a,b);
		System.out.println(sum);
		System.out.println("================");
		
		int c=5;
		int d=6;
		int sum1=add(c,d);
		System.out.println("Sum of "+c+"+"+d+"="+sum1);
		System.out.println("================");
		
		Name("raj");
		
		Name("Suraj");
		System.out.println("================");
		System.out.println("Enter the value of e");
		int e=sc.nextInt();
		System.out.println("Enter the value of f");
		int f=sc.nextInt();
		int sum2=add(e,f);
		
		System.out.println(sum2);
	}

}
