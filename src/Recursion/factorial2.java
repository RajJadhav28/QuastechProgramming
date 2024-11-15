package Recursion;

public class factorial2 {
	public static void factorial(int i, int n, int f) {
		
		if(i==n) {
			f=f*i;
			System.out.println(f);
			return;
		}
		f=f*i;
		factorial(i+1, n, f);
		
	}
	public static void main(String args[]) {
		int n=5;
		factorial(1,5, 1);
	}

}
