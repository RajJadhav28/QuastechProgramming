package InnerClass2;

interface A2{
	void show();
}
public class LambdaExpression {
	public static void main(String[] args) {
//		A2 obj=new A2() {
//			
//			@Override
//			public void show() {
//				System.out.println("show method!!!");
//			}
//		};
		
//		A2 obj=() ->{
//				System.out.println("show method!!!");
//				
//			
//		};
		//if I have only one statement we can skip the curly brases as well
		A2 obj=() -> System.out.println("show method!!!");
		obj.show();
	}
}
