package Synchronization;

class Sender4{
	public synchronized void send(String msg) {
		System.out.println("Sending\t "+msg);
	
	try {
		Thread.sleep(1000);
	}catch(Exception e) {
		System.out.println(e);
	}
	System.out.println("\n"+msg+"sent");
}
}
class ThreadSender4 extends Thread{
	private String msg;
	Sender4 sender4;
	ThreadSender4(String message, Sender4 obj){
		msg=message;
		sender4=obj;
	}
	public void run() {
		synchronized(sender4) {
			sender4.send(msg);
		}
	}
}
public class SyncMethod {
	public static void main(String args[]) {
		Sender4 send=new Sender4();
		ThreadSender4 s1=new ThreadSender4("Hi ", send);
		ThreadSender4 s2=new ThreadSender4("Bye ", send);
		
		s1.start();
		s2.start();
		try {
			s1.join();
			s2.join();
		}catch(Exception e) {
			System.out.println("Interrupted.");
		}
	}

}
