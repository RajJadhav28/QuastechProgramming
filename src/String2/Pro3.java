package String2;

public class Pro3 {
	public static void main(String[] args) {
		String s1="Yuvraj";
		String s2=new String("Yuvraj");
		String s3="Yuvraj";
		String s4="YUVRAJ";
		String s5="Ratan";
		
		System.out.println(s1==s2);//false
		System.out.println(s1==s3);//true
		System.out.println(s1==s4);//false
		
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//true
		System.out.println(s1.equals(s4));//false
		System.out.println(s1.equalsIgnoreCase(s4));//true
		
		String s7=String.join("-", s1, s3);
		System.out.println(s7);
		
		String s8=String.valueOf(s1);
		System.out.println(s8);
		char ch[]=new char[6];
		System.out.println(s1.charAt(5));
		
		char cha[]=new char[5];
		s1.getChars(0, 5, cha, 0);
		for(char c: cha) {
			System.out.println(c);
		}
		s2=s2.intern();
		System.out.println(s2);
		System.out.println("no. of chars:"+s1.length());
		
		
		
		
		
		
		
	}
}
