package Basics;
import java.util.*;
public class Arrays3 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n,i,t,flag=0;
		int a[]=new int[100];
		System.out.println("Enter the size.");
		n=sc.nextInt();
		System.out.println("Enter the number of array elements:");
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the elements to be searched.");
		t=sc.nextInt();
		for(i=0;i<n;i++) {
			if(t==a[i]) {
				flag=1;
				System.out.println("Index position:"+i);
				break;
			}
		}
		if(flag==0) {
			System.out.println("element not found!!!");
		}
	}

}
