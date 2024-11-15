package Super;

class vehicle{
	int maxspeed=40;
	vehicle(){
		System.out.println("constructor of vehicle class.");
	}
	void message() {
		System.out.println("Vehicle is a super class.");
	}
}
class car extends vehicle{
	int maxspeed=60;
	car(){
		super();
		System.out.println("constructor of car class.");
	}
	void display() {
		System.out.println("MaxSpeed: "+super.maxspeed);
		}
	void message() {
		super.message();
		System.out.println("Car is a subclass.");
	}
}
public class Variablesuper {
	public static void main(String args[]) {
		car obj=new car();
		obj.display();
		obj.message();
		
	}

}
