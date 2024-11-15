package Ploymorphism;

//also known as overloading
public class ComplieTime {
	public static int add(int a, int b) {
		return a+b;
	}
	public static double add(double a, double b, double c) {
		return a+b+c;
	}
	public int add(int c, int d, int e, int f) {
		return c+d+e+f;
	}
	public static void main(String args[]) {
		System.out.println(add(2,3));
		System.out.println(add(2,3,4));
		ComplieTime obj= new ComplieTime();
		System.out.println(obj.add(2,3,4,2));
		}

}
