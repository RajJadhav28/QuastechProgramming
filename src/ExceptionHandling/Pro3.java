package ExceptionHandling;

public class Pro3 {
	//NullPointerException
	public static void main(String args[]) {
		try {
			String a=null;
			System.out.println(a.charAt(0));
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
