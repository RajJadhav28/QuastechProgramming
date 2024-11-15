package Multithreading;
import java.io.*;

class ThreadJoin extends Thread {
	public void run() {
		for(int i=0;i<2;i++) {
			try {
				Thread.sleep(300);
				System.out.println("The current thread name:"+Thread.currentThread().getName());
			}catch(Exception e) {
				System.out.println("The exception has been caught:"+e);
			}
			System.out.println(i);
		}
	}
}
public class Pro8{
	public static void main(String args[]) {
		ThreadJoin th1=new ThreadJoin();
		ThreadJoin th2=new ThreadJoin();
		ThreadJoin th3=new ThreadJoin();
		
		th1.start();
		
		try {
			System.out.println("The current thread name:"+Thread.currentThread().getName());
			th1.join(1500);
		}catch(Exception e) {
			System.out.println("The exception has been caught:"+e);
		}
		th2.start();
		try {
			System.out.println("The current thread name:"+Thread.currentThread().getName());
			th2.join();
		}catch(Exception e) {
			System.out.println("The exception has been caught:"+e);
		}
		th3.start();
		
		
	}

	
	
}



