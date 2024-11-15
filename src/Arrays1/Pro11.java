package Arrays1;

import java.util.Scanner;

public class Pro11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows array:");
		int s1=sc.nextInt();
		System.out.println("Enter the columns array:");
		int s2=sc.nextInt();
		int arr[][]=new int [s1][s2];
		int arr1[][]=new int[s1][s2];
		int crr[][]=new int[s1][s2];
		
		System.out.println("Enter the elements of first matrix:");
		for(int i=0;i<s1;i++) {
			for(int j=0;j<s2;j++) {
				arr[i][j]=sc.nextInt();
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Enter the elements of second matrix:");
		for(int i=0;i<s1;i++) {
			for(int j=0;j<s2;j++) {
				arr1[i][j]=sc.nextInt();
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Addition of two matrix:");
		for(int i=0;i<s1;i++) {
			for(int j=0;j<s2;j++) {
				crr[i][j]=arr[i][j]+arr1[i][j];
				System.out.print(crr[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
