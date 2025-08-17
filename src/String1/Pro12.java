package String1;

public class Pro12 {

	public static void main(String[] args) {
		String s="Kansihk";
		int a=10;
		String s1=" Kanishk ";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s);
		System.out.println(s1.trim());
		System.out.println(s.startsWith("K"));
		System.out.println(s.endsWith("a"));
		System.out.println(s.endsWith("k"));
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(4));
		System.out.println(s.length());
		String s2=s.intern();
		System.out.println(s2);
		String s3=String.valueOf(a);
		System.out.println(s3);
		System.out.println(s3+10);
		String rs=s.replace("K", "T");
		System.out.println(rs);
		

	}

}
