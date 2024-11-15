package ExceptionHandling;

public class Pro6 {
	//ClassNotFoundException.
	public static void main(String args[]) {
		try {
			Class.forName("Age");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
