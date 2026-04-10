package Multithreading2;

class MyThread1 extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Thread running:"+i);
		}
	}
}
public class Pro2 {
	public static void main(String[] args) {
		MyThread1 t1=new MyThread1();
		t1.start();
	}
}
