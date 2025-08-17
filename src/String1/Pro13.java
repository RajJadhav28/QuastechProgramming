package String1;

public class Pro13 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello");
		sb.append(" Java");
		System.out.println(sb);
		
		sb.insert(1, "php");
		System.out.println(sb);
		StringBuffer sb1=new StringBuffer("Hello");
		sb1.replace(1, 3, "DotNet");
		System.out.println(sb1);
		StringBuffer sb2=new StringBuffer("Hello");
		sb2.delete(1, 3);
		System.out.println(sb2);
		StringBuffer sb3=new StringBuffer("Hello");
		sb3.reverse();
		System.out.println(sb3);
		StringBuffer sb4=new StringBuffer("Hello");
		System.out.println(sb4.capacity());
		sb4.append("Hello");
		System.out.println(sb4);
		System.out.println(sb4.capacity());
		sb4.append(" java is my favourite language.");
		System.out.println(sb4.capacity());
		StringBuffer sb5=new StringBuffer("Hello");
		sb5.append("Hello");
		System.out.println(sb5.capacity());
		sb5.ensureCapacity(10);
		System.out.println(sb5.capacity());
		sb5.ensureCapacity(50);
		System.out.println(sb5.capacity());


	}

}
