package Ploymorphism;

class A{
	int a=5;
	public int a(int c, int d){
		return c+d;
	}
}
class B{
	int b=6;
	public int a(int e, int f) {
		return e+f;
	}
}
class C{
	public static void a(int a,int b) {
		System.out.println(a+b);
		return;
	}
}
public class RunTime extends A{
	public static void main(String args[]) {
		RunTime obj=new RunTime();
		obj.a(4, 5);
		System.out.println(obj.a);
		A obj1=new RunTime();
		System.out.println(obj1.a);
		System.out.println(obj1.a(4, 5));
//		C obj=new RunTime();
//		obj.a(10, 20);
		
	}

}
