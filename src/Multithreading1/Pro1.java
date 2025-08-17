package Multithreading1;

public class Pro1 extends Thread{
	public void run() {
		System.out.println("Thread is running...");
	}
	public static void main(String[] args) {
		Pro1 p1=new Pro1();
		p1.start();
	}

}
