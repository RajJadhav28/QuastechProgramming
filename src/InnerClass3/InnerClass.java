package InnerClass3;

class A{
	int age;
	public void show() {
		System.out.println("in show method");
	}
	static class B{
		public void config() {
			System.out.println("in config class");
		}
	}
}
public class InnerClass {
	public static void main(String[] args) {
		A obj=new A();
		obj.show();
		A.B obj1=new A.B();
		obj1.config();
	}
}
