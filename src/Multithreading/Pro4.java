package Multithreading;

public class Pro4 implements Runnable{
	public void run() {
		System.out.println("Now the thread is running.");
	}
	public static void main(String args[]) {
		Runnable r1=new Pro4();
		Thread th1= new Thread(r1,"My new Thread.");
		th1.start();
		String str=th1.getName();
		System.out.println(str);
	}
}
