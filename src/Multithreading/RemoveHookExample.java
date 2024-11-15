package Multithreading;

public class RemoveHookExample {
	static class Msg extends Thread{
		public void run() {
			System.out.println("Bye...");
		}
	}
	public static void main(String args[]) {
		try {
			Msg ms=new Msg();
			Runtime.getRuntime().addShutdownHook(ms);
			System.out.println("The program is begining...");
			System.out.println("Waiting for 2 seconds...");
			Thread.sleep(2000);
			Runtime.getRuntime().removeShutdownHook(ms);
			System.out.println("The program is terminating...");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
