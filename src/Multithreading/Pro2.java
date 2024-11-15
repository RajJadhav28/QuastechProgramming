package Multithreading;

public class Pro2 implements Runnable{
	public void run() {
		System.out.println("thread is running.");
		}
	public static void main(String args[]) {
		Pro2 obj=new Pro2();
		Thread t1=new Thread(obj,"My new thread");
		t1.start();
		t1.getName();
//		String str=t1.getName();
//		System.out.println(str);
		}
}
