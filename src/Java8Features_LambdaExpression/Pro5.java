package Java8Features_LambdaExpression;

interface JavaInterface1{
	void showInterface(int a, int b);
}
public class Pro5 {
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Pro5 obj1=new Pro5();
		JavaInterface1 obj=obj1::add;
		obj.showInterface(10, 10);
		
	}
}
