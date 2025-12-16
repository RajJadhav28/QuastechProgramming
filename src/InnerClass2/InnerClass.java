package InnerClass2;
//we cannot make outer class static
class A{
	int age;
	public void show() {
		System.out.println("in show");
	}
	//over here class B is only used for a particular purpose i.e for class A
//	class B{
//		public void config() {
//			System.out.println(" in config");
//		}
		static class B{
			public void config() {
				System.out.println(" in config");
			}
	}
}
public class InnerClass {
	public static void main(String[] args) {
		A obj=new A();
//		A.B obj1= obj.new B();static class 
		A.B obj1= new A.B();
		obj.show();
		obj1.config();
	}
}
