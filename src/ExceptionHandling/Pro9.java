package ExceptionHandling;

import java.util.Scanner;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		super(message);
//		this.message=message;
	}
}
public class Pro9 {
	public static void validate(int age) throws InvalidAgeException{
		
		if(age<18) {
			throw new InvalidAgeException("Invalid Age!!!!");
		}else {
			System.out.println("Elegiable to vote");
		}
		
	}
	public static void main(String[] args) throws InvalidAgeException{
		Pro9 obj=new Pro9();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Age:");
		int age=sc.nextInt();
		
		obj.validate(age);
		sc.close();
		}	
}
