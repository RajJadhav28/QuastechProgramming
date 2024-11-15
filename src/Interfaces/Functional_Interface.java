package Interfaces;

interface Writable{
	void write(String txt);
}
public class Functional_Interface implements Writable{
	public void write(String txt) {
		System.out.println(txt);
		}
	public static void main(String args[]) {
		Functional_Interface obj=new Functional_Interface();
		obj.write("GeeksforGeeks");
	}
}
