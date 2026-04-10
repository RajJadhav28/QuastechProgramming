package String1;

public class Pro9 {

	public static void main(String[] args) {
		String s1="Javatpoint";
		String s2="Welcome to split world";
		System.out.println("Returning Words:");
		String arr[]=s1.split("t",0);
		for(String w:arr) {
			System.out.println(w);
		}
		System.out.println("Split array length:"+arr.length);
		//Uses format specifiers like %s (string), %d (integer), %f (float), etc.
		String arr1[]=s2.split("\\s",3);
		for(String w:arr1) {
			System.out.println(w);
		}
	}
}
