package Abstract;

abstract class bike1{
	bike1(){
		System.out.println("bike is running.");
	}
	abstract void run();
	void changegear() {
		System.out.println("gear changed.");
	}
}
class honda extends bike1{
	void run() {
		System.out.println("running safely!!!");
	}
}
public class Pro3 {
	public static void main(String args[]) {
		bike1 obj=new honda();
		obj.changegear();
		obj.run();
	
	}

}
