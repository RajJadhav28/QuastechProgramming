package Arrays;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the size of array:");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Even elements:");
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
		}
		System.out.println("Odd elements:");
		for(int i=0;i<n;i++) {
			if(arr[i]%2!=0) {
				System.out.println(arr[i]);
			}
		}
		sc.close();
	}
}
