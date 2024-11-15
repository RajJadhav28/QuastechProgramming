package Arrays;

public class Anonymous {
	static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
			
	}
	public static void main(String args[]) {
		System.out.println("Type One:");
		printArray(new int[] {10,22,33,44});
		
		System.out.println("=====================");
		
		System.out.println("Type Two:");
		int b[]= {1,2,3,4};
		printArray(b);
	}
}
