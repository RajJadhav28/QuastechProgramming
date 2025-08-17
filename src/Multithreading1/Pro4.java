package Multithreading1;

public class Pro4 extends Thread{
	public void run() {
		System.out.println("Thread is running...");
	}

	public static void main(String[] args) {
		Pro4 p4=new Pro4();
		p4.start();
		

	}

}
