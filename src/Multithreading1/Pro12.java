package Multithreading1;

public class Pro12 extends Thread{
	public void run() {
		System.out.println("running...");
	}

	public static void main(String[] args) {
		Pro12 p1=new Pro12();
		Pro12 p2=new Pro12();
		
		System.out.println("Name of the thread 1:"+p1.getName());
		System.out.println("Name of the thread 2:"+p2.getName());
		p1.start();
		p2.start();
		
		p1.setName("Quastech");
		System.out.println("After changing the name of t1:"+p1.getName());
	}

}
