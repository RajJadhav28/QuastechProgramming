package Inheritance;

interface printable{
	void print();
}
interface showable{
	void show();
}
public class MultipleInheritance implements printable, showable{

	public void print() {
		System.out.println("hello");
	}
	public void show() {
		System.out.println("Welcome");
	}
	public static void main(String args[]) {
		MultipleInheritance obj=new  MultipleInheritance();
		 obj.print();
		 obj.show();
	}
	
}