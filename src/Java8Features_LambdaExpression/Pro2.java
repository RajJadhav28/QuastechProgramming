package Java8Features_LambdaExpression;

import java.util.Scanner;

interface AA{
	public int add(int a, int b);
}
public class Pro2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a = sc.nextInt();
		System.out.println("Enter the value of b:");
		int b=sc.nextInt();
		 AA obj=(i,j)->{
			return i+j; 
		 };
		 System.out.println(obj.add(a, b));
		sc.close();
	}
}
