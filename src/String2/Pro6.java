package String2;

public class Pro6 {
	public static void main(String[] args) {
		String s1="Javatpoint";
		String s2="Welcome to split world";
		
		System.out.println("Returning words:");
		String arr[]=s1.split("t",0);
		for(String w:arr) {
			System.out.println(w);
		}
		String arr1[]=s2.split("\\s",2);
		for(String w:arr1) {
			System.out.println(w);
		}
	}
}
