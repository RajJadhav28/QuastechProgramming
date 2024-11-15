package Arrays;

public class CopyArray {
	public static void main(String args[]) {
		char copyFrom[]= {'d','e','c','a','f','f','e','i','n','a','t','e','d'};
		char copyTo[]= new char[7];
		System.arraycopy(copyFrom, 2, copyTo, 0, 7);
		System.out.println(String.valueOf(copyTo));
		
		System.out.println("============================");
		char a[]= {'a','b','c','d','e','f','g','h','i'};
		char b[]=new char[7];
		System.arraycopy(a, 1, b, 0, 5);
		System.out.println(String.valueOf(b));
	}

}
