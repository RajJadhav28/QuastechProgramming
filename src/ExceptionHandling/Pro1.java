package ExceptionHandling;

public class Pro1 {
	public static void main(String args[]) {
		int a=5;
		int b=0;
		try {
			System.out.println(a/b);
		}
//		catch(Exception e) {
//			e.printStackTrace();//will have a different type of o/p;
//		}
		catch(Exception e) {
			System.out.println(e.toString());
			System.out.println("===============");
			System.out.println(e.getMessage());
		}
	}

}
