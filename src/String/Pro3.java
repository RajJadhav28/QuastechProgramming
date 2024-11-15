package String;

public class Pro3 {
	public static void main(String args[]) {
		String s1=" Geeks for Geeks ";
		String s2="JavaTpoint";
		String s3="geeks";
		char ch[]=s3.toCharArray();
		System.out.println(s1.length());
		System.out.println(s1.charAt(3));
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(2,5));
		System.out.println(s1.indexOf("for"));
		System.out.println(s1.indexOf("Play"));
		System.out.println(s1.indexOf("for",3));
		System.out.println(s1.lastIndexOf("k"));
		System.out.println("Geeks".equals("Geeks"));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.trim());
		System.out.println(s1.replace('k', 'K'));
		System.out.println(s1.contains(s3));
		System.out.println(s1.startsWith(s3));
		System.out.println(ch);
	}

}
