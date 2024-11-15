package Abstract;

abstract class Bike{
	abstract void run(); 
}
public class Pro1 extends Bike{
	void run() {
		System.out.println("running safely");
		}
	public static void main(String args[]) {
		Bike obj=new Pro1();
		obj.run();
	}

}
