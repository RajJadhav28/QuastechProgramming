package Basics1;

import java.util.Scanner;

public class BloodDonate1 {
	public static int elegiable(int age) {
		if(age>18) {
			System.out.println("Elegiable to vote");
			return age;
		}else {
			throw new ArithmeticException();
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age:");
		int age=sc.nextInt();
//		int result=elegiable(age);
//		System.out.println(result);
		try {
			elegiable(age);
		}catch(Exception e) {
		throw new ArithmeticException();
		}

	}

}
