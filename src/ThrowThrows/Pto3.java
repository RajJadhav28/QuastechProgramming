package ThrowThrows;

import java.util.Scanner;

class MyException1 extends Exception{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Entered number is less than 98";
	}
}
class NegativeRadiusException1 extends Exception{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "radius cannot be negative";
	}
}
class MaxAgeException1 extends Exception{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Age is less than 18";
	}
}
public class Pto3 {
	public static double area(int r) throws NegativeRadiusException1{
		if(r<0) {
		throw new NegativeRadiusException1();
	}
	double result =Math.PI*r*r;
	return result;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("Enter the value of a:");
		a=sc.nextInt();
		if(a<9) {
			try {
				//throw new MyException1();
				//throw new MaxAgeException1();
				double ar=area(6);
				System.out.println(ar);
			}catch(Exception e) {
				System.out.println(e.toString());
				System.out.println(e.getMessage());
			}
			}
		System.out.println("Yes finished!!!");
	}

}
