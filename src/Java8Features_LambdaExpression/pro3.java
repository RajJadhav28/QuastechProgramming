package Java8Features_LambdaExpression;

import java.util.Scanner;

interface BB{
	public void add(int a, int b);
}
public class pro3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of a:");
		int a=sc.nextInt();
		System.out.println("Enter the value of b:");
		int b=sc.nextInt();
		
		BB obj=(i,j)->{
			System.out.println(a+b);
		};
		obj.add(a, b);
		sc.close();
	}
}
