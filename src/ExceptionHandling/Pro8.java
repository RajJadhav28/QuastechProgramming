package ExceptionHandling;

public class Pro8 {
	public static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("Person is not elegiable to vote!!!");
		}else {
			System.out.println("Person is elegiable to vote");
		}
	}
	public static void main(String[] args) {
		validate(13);
		System.out.println("rest of the code");
	}
}
