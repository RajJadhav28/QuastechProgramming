package String1;

import java.util.StringJoiner;

public class Pro7 {
	public static void main(String[] args) {
		String s1=new String("Hello");
		String s2=new String("World");
		String s=String.format("%s%s",s1,s2);
		System.out.println(s.toString());
		
		String s3="Hello World";
		char ch[]=new char[5];
		s3.getChars(0, 3, ch, 0);
		System.out.println("Copied characters:");
		for(char c:ch) {
			System.out.println(c);
		}
		
		String s4=String.join(" ", s1,s2);
		System.out.println(s4.toString());
		
		StringJoiner s5=new StringJoiner(",");
		s5.add(s1);
		s5.add("Quastech");
		System.out.println(s5);
	}

}
