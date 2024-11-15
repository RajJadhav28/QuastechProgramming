package Arrays1;

public class Pro7 {

	public static void main(String[] args) {
		int arr[]= {33,3,4,5};
		System.out.println("Printing original array:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Printing clone array:");
		int crr[]=arr.clone();
		for(int i:crr) {
			System.out.println(i);
		}

	}

}
