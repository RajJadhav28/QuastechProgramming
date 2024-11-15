package ExceptionHandling;

public class Pro4 {
	//StringIndexOutOfBoundException
	public static void main(String args[]) {
		try {
			String n="Java is an interesting language";
			char c=n.charAt(40);
			System.out.println(c);
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("==================");
		//NumberFormatException
		try {
			int num=Integer.parseInt("chakki");
			System.out.println(num);
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("==================");
		//ArrayIndexOutOfBoundsException
		try {
			int arr[]=new int[10];
			arr[11]=1;
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
