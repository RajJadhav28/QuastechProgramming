package ExceptionHandling;
import java.util.*;

public class Pro5 {
	public  static void print(int n) {
		if(n>=18) {
			System.out.println("Elegiable to vote.");
		}else {
			System.out.println("Not elegiable!!!");
		}
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age:");
		int n=sc.nextInt();
		print(n);
	}

}
