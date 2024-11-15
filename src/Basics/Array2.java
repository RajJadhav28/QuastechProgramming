package Basics;
import java.util.*;
public class Array2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int i,n;
		int a[]=new int[100];
		System.out.println("Enter the number of values of arrays:");
		n=sc.nextInt();
		System.out.println("Enter the values:");
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(i=0;i<=n;i++) {
			if(a[i]%2==0) {
				System.out.println("Even number."+a[i]);
			}else {
				System.out.println("Odd number."+a[i]);
			}
		}
	sc.close();	
	}

}
