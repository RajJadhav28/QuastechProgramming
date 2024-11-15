package Arrays;
import java.util.*;

public class AddingTwoArrays {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array:");
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter the array elements:");
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Max element of array:");
	int max=arr[0];
	for(int i=0;i<n;i++) {
		if(arr[i]>max) 
			arr[i]=max;
	}
	System.out.println(max);
	
	System.out.println("Min element of array:");
	int min=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]<min) 
			arr[i]=min;
	}
	System.out.println(min);
	
	}
	
	
}


