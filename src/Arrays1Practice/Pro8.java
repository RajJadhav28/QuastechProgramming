package Arrays1Practice;

import java.util.Scanner;

public class Pro8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();int flag=0;
		int arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Printing the original array:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Enter the array elemnt to be searched:");
		int t=sc.nextInt();
		for(int i=0;i<=arr.length;i++) {
			if(arr[i]==t) {
				System.out.println("Index position:"+i);
				System.out.println("Position:"+(i+1));
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("Element not found!!!");
		}

	}

}
