package Multithreading1;

class Threadname extends Thread{
	Threadname(String Threadname){
		super(Threadname);
	}
	public void run() {
		System.out.println("The thread is executing...");
	}
}
public class Pro13 {
	public static void main(String[] args) {
		Threadname p1=new Threadname("John");
		Threadname p2=new Threadname("Anni");
		System.out.println("Thread 1-"+p1.getName());
		System.out.println("Thread 2-"+p2.getName());
		p1.start();
		p2.start();
		

	}

}
