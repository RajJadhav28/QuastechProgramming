package Java8Features_LambdaExpression;

interface A11{
	public void add(int a, int b);
}
public class Pro1 {
	public static void main(String[] args) {
		A11 obj=(a,b)->{
			System.out.println("Result:"+(a+b));
		};
		obj.add(10,20);
	}
}
