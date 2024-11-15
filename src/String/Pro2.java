package String;

public class Pro2 {
	public  void string(String s1, String s2, String s3) {
		System.out.println(s3);
	}
	public String string1(String s4, String s5, String s6) {
		System.out.println(s4);
		return s4;
	}
	public static void main(String args[]) {
		Pro2 obj=new Pro2();
		String s1="Hello",
				s2=" how are u";
		String s3=s1.concat(s2);
		obj.string(s1, s2, s3);
		
		System.out.println("=============================");
		
		String s5="What r",
				s6=" u doing";
		String s4=s5.concat(s6);
		obj.string(s5, s6, s4);
	}

}
