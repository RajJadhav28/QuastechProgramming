package Arrays;
import java.util.*;

public class PositiveNegative1 {
	public static int pattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		return n;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the value:");
		n=sc.nextInt();
		pattern(n);
		sc.close();
	}

}
