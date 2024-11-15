package Arrays;
import java.util.*;

public class PositiveNegative {
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
		System.out.println("Positive elements:");
		for(int i=0;i<n;i++) {
			if(arr[i]>=0) {
				System.out.println(arr[i]);
			}
		}
		System.out.println("Negative elements:");
		for(int i=0;i<n;i++) {
			if(arr[i]<=0) {
				System.out.println(arr[i]);
			}
		}
		sc.close();
	}

}
