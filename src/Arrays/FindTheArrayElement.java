package Arrays;
import java.util.*;

public class FindTheArrayElement {
	public static void main(String args[]) {
		int flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be searched:");
		int temp=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(temp==arr[i]) {
				flag=1;
			System.out.println("Index position:"+i);
			System.out.println("Actual position:"+(i+1));
			}
		}
		if(flag==0) {
			System.out.println("Element not found!!!");
		}
		sc.close();
	}

}
