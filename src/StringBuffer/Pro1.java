package StringBuffer;

public class Pro1 {
	//Besides that, all the methods that are used in the String class can also be used.
	public static void main(String args[]) {
		StringBuffer sb=new StringBuffer("Hello");
		sb.append(" Java");
		System.out.println(sb);
		sb.insert(10, " how r u ?");
		System.out.println(sb);
		sb.replace(15, 19, "are you");
		System.out.println(sb);
		sb.delete(3, 5);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		System.out.println(sb.capacity());
		StringBuffer sb1=new StringBuffer("Hello");
		sb1.append(" Java how r u ?");
		System.out.println(sb1);
		System.out.println(sb1.capacity());
	}

}
