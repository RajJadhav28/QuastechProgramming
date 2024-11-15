package Arrays;
import java.util.*;

public class Reverse {
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
		System.out.println("Original Array:");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Reverse Array:");
		for(int i=n-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
		
	}

}
