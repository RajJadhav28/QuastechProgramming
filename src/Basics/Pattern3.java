package Basics;
import java.util.*;
public class Pattern3 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int i,n,j;
		System.out.println("Enter the value:");
		n=sc.nextInt();
		for(i=1;i<=n;i++) {
			for(j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(j=1;j<=i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=n-1;i>=1;i--) {
			for(j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(j=1;j<=i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
