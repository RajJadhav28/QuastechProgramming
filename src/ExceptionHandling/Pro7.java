package ExceptionHandling;
import java.util.*;

public class Pro7 {
	public static void main(String args[]) {
		
		int arr[]=new int[3];
		try {
			int i=arr[4];
		}catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("finally block executed!!!");
		}
	}

}
