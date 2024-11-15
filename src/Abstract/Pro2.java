package Abstract;

abstract class shape{
	abstract void draw();
}
class rectangle extends shape{
	void draw() {
		System.out.println("drawing rectangle!!!");
	}
}
class circle extends shape{
	void draw() {
		System.out.println("drawing circle!!!");
	}
}
public class Pro2 {
	public static void main(String args[]) {
		shape s=new circle();
		circle s1=new circle();
		shape s2=new rectangle();
		s2.draw();
		s1.draw();
		s.draw();
	}

}
