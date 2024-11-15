package String;

public class Pro1 {
	public static void string(String str) {
		System.out.println(str);
		}
	public static String string1(String str1) {
		System.out.println(str1);
		return str1;
	}
	 void string2(String str2) {
		System.out.println(str2);
		return ;
	}
	public static void main(String args[]) {
		string("First String.");
		string1("Second String.");
		Pro1 obj=new Pro1();
		obj.string2("Third String");
		
	}

}
