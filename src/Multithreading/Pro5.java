package Multithreading;

public class Pro5 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(500);
				
			}catch(Exception e) {
				System.out.println(e);
				}
			System.out.println(i);
			}
	}
	public static void main(String args[]) {
		Pro5 obj=new Pro5();
		Pro5 obj2=new Pro5();
		obj.start();
		obj2.start();
	}

}
