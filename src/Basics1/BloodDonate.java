package Basics1;

import java.util.Scanner;

public class BloodDonate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter the age");
			int age=sc.nextInt();
			if(age>18) {
				System.out.println("Enter the weight:");
				double weight=sc.nextDouble();
				if(weight>60) {
					System.out.println("You are elegiable to donate blood");
				}else {
					System.out.println("Weight must be greater than 60");
				}
			}else {
				System.out.println("Age should be 18+");
			}
		}catch(Exception e) {
			System.out.println("Invalid!!!");
		}
		sc.close();

	}

}
