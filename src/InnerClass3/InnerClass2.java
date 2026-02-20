package InnerClass3;

class A31{
	int age;
	public void show() {
		System.out.println("in show method");
	}
	static class B2{
		public void config() {
			System.out.println("in config class");
		}
	}
}
public class InnerClass2 {
	public static void main(String[] args) {
		A31 obj=new A31();
		obj.show();
		A31.B2 obj1=new A31.B2();
		obj1.config();
	}
}
