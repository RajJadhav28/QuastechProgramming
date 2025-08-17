package String;

import java.util.Scanner;

public class Pro6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1;
		System.out.println("Enter the characters:");
		s1=sc.next().toLowerCase();
		
		int c=0,vc=0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u') {
				c++;
			}else if(s1.charAt(i)>='a'&&s1.charAt(i)<='z'){
				vc++;
			}
		}
		System.out.println("Vowels:"+c);
		System.out.println("Consonents:"+vc);
	}

}
