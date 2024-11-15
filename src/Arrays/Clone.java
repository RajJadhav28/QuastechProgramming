package Arrays;

public class Clone {
	public static void main(String args[]) {
		System.out.println("Array arr:");
		int arr[]= {33,3,4,5};
		for(int i:arr) {
			System.out.println(i);
		}
		System.out.println("Cloning array arr to brr");
		System.out.println("Array brr:");
		int brr[]=arr.clone();
		for(int j:brr) {
			System.out.println(j);
		}
		System.out.println("Are both the arrays equal:");
		System.out.println(arr==brr);
	}

}
