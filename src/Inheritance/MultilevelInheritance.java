package Inheritance;

class one1{
	int salary1=4000;
	
	public void print_geek() {
		System.out.println("Geeks");
	}
}
class two1 extends one1{
	float salary=4000;
	public void print_for() {
		System.out.println("for");
	}
}
class three extends two1{
	public void print_geek() {
		System.out.println("Geeks");
	}
}
public class MultilevelInheritance {
	public static void main(String args[]) {
		three obj=new three();
		System.out.println("salary:"+obj.salary);
		System.out.println("salary:"+obj.salary1);
		obj.print_geek();
		obj.print_for();
		obj.print_geek();
	}

}
