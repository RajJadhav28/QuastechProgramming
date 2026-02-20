package InnerClass3;

interface A2{
	void show();
}
interface A3{
	void shows(int i);
}
public class LambdaExpression {
	public static void main(String[] args) {
		A2 obj=()->{
			System.out.println("show method!!!");
		};
		obj.show();
		
		A3 obj1=(i)->{
			System.out.println("Anonymous inner class:"+i);
		};
		obj1.shows(5);
	}
	
}
