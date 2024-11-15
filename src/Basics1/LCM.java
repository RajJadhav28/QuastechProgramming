package Basics1;

import java.util.Scanner;

public class LCM {
	public static int gcd(int n, int m) {
		int gcd=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0&&m%i==0) {
				 gcd=i;
				
			}
		}
		return gcd;
	}
	public static int lcm(int n, int m) {
		int lcm=(n*m)/gcd(n, m);
		return lcm;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int n=sc.nextInt();
		System.out.println("Enter the value:");
		int m=sc.nextInt();
		int gcdresult=gcd(n, m);
		System.out.println("GCD:"+gcdresult);
		int lcmresult=lcm(n, m);
		System.out.println("LCM:"+lcmresult);
		sc.close();

	}

}
