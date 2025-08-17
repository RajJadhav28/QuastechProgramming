package Arrays1;

import java.util.Scanner;

public class Pro16 {
	public static int largest(int arr[], int n) {
		int temp=0;
		for(int i=0;i<arr.length;i++) {
				if(arr[i]>temp) {
					temp=arr[i];
					
				}
			}
		
		return temp;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=sc.nextInt();
		}
		int result=largest(arr,n);
		System.out.println("Largest element of array:"+result);
		sc.close();
	}

}
