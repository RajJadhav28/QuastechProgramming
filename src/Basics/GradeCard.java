package Basics;
import java.util.*;
public class GradeCard {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the percentage to find grade.");
		n=sc.nextInt();
		if(n<=100&&n>=85) {
			System.out.println("O Grade");
		}else if(n<=85&&n>=75) {
			System.out.println("A Grade");
		}else if(n<=75&&n>=65) {
			System.out.println("B Grade");
		}else if(n<=65&&n>=55) {
			System.out.println("C+ Grade");
		}else if(n<=55&&n>=45) {
			System.out.println("C Grade");
		}else if(n<=45&&n>=35) {
			System.out.println("D Grade");
		}else if(n<=35&&n>=0){
			System.out.println("Fail!!!");
		}else {
			System.out.println("Invalid Output!!!");
		}
	}

}
