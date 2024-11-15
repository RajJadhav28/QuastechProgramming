package Multithreading;

class MyThread extends Thread{
	public void run() {
		System.out.println("Shutdown task completed.");
	}
}
public class Shutdown {
	public static void main(String args[]) throws Exception{
		Runtime r=Runtime.getRuntime();
		r.addShutdownHook(new MyThread());
		
		System.out.println("Now main thread sleeping... press ctrl+c to exit.");
		try {
			Thread.sleep(3000);
		}catch(Exception e) {}
	}

}
