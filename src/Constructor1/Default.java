package Constructor1;

class Bike{
	Bike(){
		System.out.println("Bike is running.");
	}
}
public class Default extends Bike{
	public static void main(String args[]) {
		Bike b=new Bike();
	}

}
