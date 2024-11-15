package Basics;
import java.util.*;

public class PrimeNumber {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int flag=0;
		int n;
		System.out.println("Enter the number to check:");
		n=sc.nextInt();
		for(int i=2;i<n;i++) {
			if(n%i==0) {
			flag=1;
			break;
		}
		}
		if(flag==0) {
			System.out.println("Prime number.");
		}else {
			System.out.println("Not Prime!!!");
		}
	}
	}


