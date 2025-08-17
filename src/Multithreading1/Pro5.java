package Multithreading1;

public class Pro5 implements Runnable{
	public void run() {
		System.out.println("thread is running...");
	}

	public static void main(String[] args) {
		Pro5 p5=new Pro5();
		Thread t1=new Thread(p5);
		t1.start();
		
		

	}

}
