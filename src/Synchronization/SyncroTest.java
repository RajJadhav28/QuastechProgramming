package Synchronization;

class PrintTest extends Thread{
	synchronized public void printThread(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println("Thread "+n+" is working");
			try {
				Thread.sleep(600);
			}catch(Exception e) {
				System.out.println(e);
			}
			}
		System.out.println("-------------------");
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}
 class Thread1 extends Thread{
	PrintTest test;
	Thread1(PrintTest p){
		test=p;
	}
	public void run() {
		test.printThread(1);
	}
}
 class Thread2 extends Thread{
	 PrintTest test;
	 Thread2(PrintTest p){
		 test=p;
	 }
	 public void run() {
		 test.printThread(2);
	 }
 }
public class SyncroTest {
	public static void main(String args[]) {
		PrintTest p=new PrintTest();
		Thread1 t1=new Thread1(p);
		Thread2 t2=new Thread2(p);
		
		t1.start();
		t2.start();
	}

}
