package Arrays1;

public class Pro6 {

	public static void main(String[] args) {
		char arr[]= {'q','u','a','s','t','e','c','h'};
		char arr1[]=new char[7];
		System.arraycopy(arr,2, arr1,0,4);
		System.out.println(String.valueOf(arr1));

	}

}
