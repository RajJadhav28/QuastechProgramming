package Wrapper;

class Animal{
	 int i=10;
}
class Monkey extends Animal{
	int j=20;
}
public class UpAndDownCasting {
	public static void main(String args[]) {
		Animal a=new Monkey();
		System.out.println("UpCasting i="+a.i);
		
		Monkey m=(Monkey)a;
		System.out.println("DownCasting j="+m.j);
		 
//		Monkey m1=new Monkey();
//		System.out.println(m1.i+" "+m1.j);
	}

}
