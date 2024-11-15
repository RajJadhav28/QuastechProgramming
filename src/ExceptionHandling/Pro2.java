package ExceptionHandling;

public class Pro2 {
	//ArithmeticException
	public static void main(String args[]) {
		try {
			int a=30, b=0;
			int c=a/b;
			System.out.println(c);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
