package Basics;
import java.util.*;
public class Arrays1 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int i,n;
		System.out.println("Enter the number of array elements:");
		n=sc.nextInt();
		int a[]=new int[100];
		System.out.println("Enter the elements of array:");
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++) {
			if(a[i]>0) {
				System.out.println("Positive elements:"+a[i]);
			}else {
				System.out.println("Negative elements:"+a[i]);
			}
		}
	}

}
