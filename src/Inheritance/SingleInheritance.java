package Inheritance;

class one{
	float salary=4000;
	public void print_geek() {
		System.out.println("Geeks");
		}
}
class two extends one{
	int bounce=1000;
	public void print_for() {
		System.out.println("for");
	}
}
public class SingleInheritance {
	public static void main(String args[]) {
		two g=new two();
	System.out.println("Salary:"+g.salary);
	System.out.println("bounce:"+g.bounce);
		g.print_geek();
		g.print_for();
		g.print_geek();
	}

}
