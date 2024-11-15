package Arrays1;

import java.util.Scanner;

public class Pro9 {
	public static int array(int arr[], int t) {
	
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==t) {
				return (i);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int s=sc.nextInt();
		int arr[]=new int[s];
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be find:");
		int t=sc.nextInt();
		
		int result=array(arr,t);
		if(result==-1) {
			System.out.println("Result not found");
		}else {
			System.out.println("Element found at index:"+result);
		}
		
		

	}

}
