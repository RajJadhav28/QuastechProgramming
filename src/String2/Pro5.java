package String2;

import java.util.StringJoiner;

import javax.net.ssl.SSLEngine;

public class Pro5 {
	public static void main(String[] args) {
		String s1=new String("Hello");
		String s2=new String("World");
		String s3=s1.concat(s2);
		System.out.println(s3);
		String s4=String.join("-", s1,s2);
		System.out.println(s4);
		
		StringJoiner s5=new StringJoiner(",");
		s5.add(s1);
		s5.add("Quastech");
		System.out.println(s5);
		
		String s6="Welcome to World.";
		char ch[]=s1.toCharArray();
		int length=ch.length;
		System.out.println("length:"+length);
		for(int i=0;i<length;i++) {
			System.out.print(ch[i]);
		}
	}
}
