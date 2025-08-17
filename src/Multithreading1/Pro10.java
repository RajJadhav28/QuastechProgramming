package Multithreading1;

public class Pro10 extends Thread{

	public static void main(String[] args) {
		try {
			for(int i=0;i<5;i++) {
				Thread.sleep(-500);
				System.out.println(i);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
