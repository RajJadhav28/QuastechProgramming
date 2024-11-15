package Basics;
import java.util.*;
public class Pattern1 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int i,j,n;
		System.out.println("Enter the value:");
		n=sc.nextInt();
		for(i=0;i<n;i++) {
			for(j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
