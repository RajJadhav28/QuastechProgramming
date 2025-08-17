package Multithreading1;

public class Pro11 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(500);	
				System.out.println("The current thread name:"+Thread.currentThread().getName());
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Pro11 th1=new Pro11();
		Pro11 th2=new Pro11();
		Pro11 th3=new Pro11();
		
		th1.start();
		try {
			System.out.println("The current thread name :"+Thread.currentThread().getName());
			th1.join();
		}catch(Exception e) {
			e.printStackTrace();
		}
		th2.start();
		try {
			System.out.println("The current thread name :"+Thread.currentThread().getName());
			th2.join();
		}catch(Exception e) {
			e.printStackTrace();
		}
		th3.start();
		
		
		

	}

}
