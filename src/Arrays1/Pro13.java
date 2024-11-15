package Arrays1;

import java.util.Scanner;

public class Pro13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int visited[]=new int[arr.length];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<visited.length;i++) {
			visited[i]=-1;
		}
		for(int i=0;i<arr.length;i++) {
			int count=1;
			if(visited[i]==0) {
				continue;
			}
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					visited[j]=0;
				}
			}
			visited[i]=count;
			
		}
		for(int i=0;i<arr.length;i++) {
			if(visited[i]!=0) {
				System.out.println(arr[i]+":"+visited[i]);
			}
		}
	}

}
