package Inheritance;

class x{
	public void print_A() {
		System.out.println("A");
	}
}
class y extends x{
	public void print_B() {
		System.out.println("B");
	}
}
class z extends x{
	public void print_C() {
		System.out.println("C");
	}
}
class m extends x{
	public void print_M() {
		System.out.println("M");
	}
}
public class HierarchicalInheritance {
	public static void main(String args[]) {
		y obj =new y();
		z obj1=new z();
		m obj2=new m();
		
		obj.print_A();
		obj.print_B();
		
		obj1.print_A();
		obj1.print_C();
		
		obj2.print_A();
		obj2.print_M();
	}

}
