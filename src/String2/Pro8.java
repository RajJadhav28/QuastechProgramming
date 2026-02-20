package String2;

public class Pro8 {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello");
		System.out.println(sb.append(" Java"));
		
		sb.insert(1, "php");
		System.out.println(sb);
		StringBuffer sb1=new StringBuffer("Hello");
		System.out.println(sb1.replace(1, 3, "DotNet"));
		
	}
}
