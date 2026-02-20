package String2;

public class Pro7 {
	public static void main(String[] args) {
		String s1="Sachin Tendulkar";
		System.out.println("Original String:"+s1);
		System.out.println(s1.substring(6));
		System.out.println(s1.substring(0,6));
		
		String s="Kanshik";
		int a=10;
		String s2=" Kanishk";
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s);
		System.out.println(s2.trim());
		System.out.println(s.startsWith("K"));
		System.out.println(s.endsWith("a"));
		System.out.println(s.endsWith("k"));
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(4));
		System.out.println(s.length());
		String rs=s.replace("K", "T");
		System.out.println();
		System.out.println(rs);
		
	}
}
