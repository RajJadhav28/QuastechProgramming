package Basics;
import java.util.*;
public class LeapYear {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("Enter the year:");
		a=sc.nextInt();
		if((a%4==0&&a%100!=0)||(a%400==0)){
			System.out.println("Year: "+a+" is Leap Year");
		}else {
			System.out.println("Year: "+a+" is not a Leap Year!!!");
		}
		sc.close();
	}

}
