package InnerClass3;

abstract class A1{
	abstract void show();
}
public class AnonymousInner {
	public static void main(String[] args) {
		A1 obj=new A1() {
			
			@Override
			void show() {
				System.out.println("Show method!!!");
			}
		};
		obj.show();
	}
}
