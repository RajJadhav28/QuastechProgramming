package Multithreading2;

class MyRunnable implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Runnable Thread:"+i);
		}
	}
}
public class Pro3 {
	public static void main(String[] args) {
		MyRunnable r=new MyRunnable();
		Thread t1=new Thread(r);
		t1.start();
		System.out.println("Name of the thread:"+t1.getName());
	}
}
