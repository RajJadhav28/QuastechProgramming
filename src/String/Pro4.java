package String;

public class Pro4 {

	public static void main(String[] args) {
		String s1="Sachin";
		String s2=new String("Sachin");
		String s3="Sachin";
		String s4="SACHIN";
		String s5="Ratan";
		System.out.println(s1.equals(s2));//using equals() method
		System.out.println(s1.equals(s3));//using equals() method
		System.out.println(s1.equalsIgnoreCase(s4));//using equalsIgnoreCase() method
		System.out.println(s1==s2);//using == operator(because s2 refers to instance created in non-pool)
		System.out.println(s1==s3);//using== operator(because s3 refers to instance created foe s1)
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s5));
		System.out.println(s5.compareTo(s1));

	}

}
