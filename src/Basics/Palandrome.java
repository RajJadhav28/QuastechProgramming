package Basics;
import java.util.*;
public class Palandrome {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int r,sum=0,temp,n;
		System.out.println("Enter the number to be checked.");
		n=sc.nextInt();
		
		temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("Palandrome.");
		}else {
			System.out.println("Not Palandrome.");
		}
	}

}
