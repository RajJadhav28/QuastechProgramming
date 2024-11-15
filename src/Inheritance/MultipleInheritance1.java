package Inheritance;

interface print{
	void print_geek();
}
interface show{
	void show();
}
interface threee extends print,show{
	public void print_geek();
}
class child implements threee{
	public void print_geek() {
		System.out.println("Geeks");
	}
	public void show() {
		System.out.println("Show");
	}
}
public class MultipleInheritance1 {
	public static void main(String args[]) {
		child c=new child();
		c.print_geek();
		c.show();
		c.print_geek();
	}

}
