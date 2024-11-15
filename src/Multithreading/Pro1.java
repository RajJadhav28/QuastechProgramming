package Multithreading;

public class Pro1 extends Thread{
	
	public void run() {
		System.out.println("Thread is running.");
	}
	public static void main(String args[]) {
		Pro1 obj=new Pro1();
		//Thread th1=new Thread(obj,"My new thread");
		obj.start();
		//String str=th1.getName();
		//System.out.println(str);
		
	}

}
