package Arrays1;

import java.util.Scanner;

public class Pro12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int s1=sc.nextInt();
		System.out.println("Enter the number of columns:");
		int s2=sc.nextInt();
		
		int arr1[][]=new int [s1][s2];
		int arr2[][]=new int [s2][s1];
		int crr[][]=new int [s1][s2];
		
		System.out.println("Enter the elements of first matrix:");
		for(int i=0;i<s1;i++) {
			for(int j=0;j<s2;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter the elements of second matrix:");
		for(int i=0;i<s2;i++) {
			for(int j=0;j<s1;j++) {
				arr2[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<s1;i++) {
			for(int j=0;j<s2;j++) {
				 crr[i][j]=0;
				
				for(int k=0;k<s2;k++) {
					crr[i][j]+=arr1[i][k]*arr2[k][j];
				}
			}
		}
		System.out.println("Resultant Matrix:");
		for(int i=0;i<s1;i++) {
			for(int j=0;j<s2;j++) {
				System.out.print(crr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
