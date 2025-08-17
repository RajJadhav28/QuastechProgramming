package Multithreading1;

public class Pro8 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Pro8 p1=new Pro8();
		p1.start();
		Pro8 p2=new Pro8();
		p2.start();

	}

}
