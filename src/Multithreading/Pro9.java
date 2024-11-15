package Multithreading;

class ThreadDemo extends Thread{
	public void run() {
		System.out.println("Inside run method.");
	}
}
public class Pro9 {
	public static void main(String args[]) {
		ThreadDemo th1=new ThreadDemo();
		ThreadDemo th2=new ThreadDemo();
		ThreadDemo th3=new ThreadDemo();
		
		System.out.println("Thread1 priority:"+th1.getPriority());
		System.out.println("Thread2 priority:"+th2.getPriority());
		System.out.println("Thread3 priority:"+th3.getPriority());
		
		th1.setPriority(2);
		th2.setPriority(7);
		th3.setPriority(8);
		System.out.println("After chaging priority of the Threads:");
		
		System.out.println("Thread1 priority:"+th1.getPriority());
		System.out.println("Thread2 priority:"+th2.getPriority());
		System.out.println("Thread3 priority:"+th3.getPriority());
		
		System.out.println("Thread Name:"+Thread.currentThread().getName());
		System.out.println("Main Thread priority:"+Thread.currentThread().getPriority());
		
		System.out.println("After changing the priority of main Thread:");
		Thread.currentThread().setPriority(8);
		System.out.println("Main Thread Priority:"+Thread.currentThread().getPriority());
		
		
	}

}
