package Basics;
import java.util.*;
public class Discount {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		
		System.out.println("Enter the amount:");
		a=sc.nextInt();
		if(a<=2000&&a>=1000) {
		b=(a*10/100);
		c=a-b;
		System.out.println("10% discount, You have to pay:"+c);
		}else if(a<=1000&&a>=500) {
			b=(a*5/100);
			c=a-b;
			System.out.println("5% discount, You have to pay:"+c);
		}else if(a<=500&&a>=0) {
			System.out.println("No discount, You have to pay:"+a);
		}else {
			System.out.println("Invalid number!!!");
		}
		sc.close();
	}

}
