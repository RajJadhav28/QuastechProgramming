package Basics;

public class swapping2 {
	public static void main(String args[]) {
		int a=3, b=2;
		//before swapping
		System.out.println("Before swapping= a:"+a+" & b:"+b);
		//swapping using two variables
		a=a+b;
		b=a-b;
		a=a-b;
		
//		swapping variables
//		int temp=a;
//		a=b;
//		b=temp;
		
		//After swapping
		System.out.println("After swapping= a:"+a+" & b:"+b);
		}

}
