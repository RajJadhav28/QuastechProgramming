package Multithreading;

public class Pro10 extends Thread{
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("deamon thread works.");
		}else {
			System.out.println("user thread works.");
		}
	}
	public static void main(String args[]) {
		Pro10 t1=new Pro10();
		Pro10 t2=new Pro10();
		Pro10 t3=new Pro10();
		
		t1.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
