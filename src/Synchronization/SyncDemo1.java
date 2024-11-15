package Synchronization;

//A class used to send message
class Sender1{
	public void send(String msg) {
		System.out.println("Sending\t"+msg);
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("\n"+msg+" Sent");
		}
}
//class for sending a message using thread
class ThreadSender1 extends Thread{
	private String msg;
	Sender1 sender;
	ThreadSender1(String m, Sender1 obj){
		msg=m;
		sender=obj;
	}
	public void run() {
		//only one thread can send a message at a time.
		synchronized(sender) {
			//synchronizing the send message
			sender.send(msg);
		}
	}
}
public class SyncDemo1 {
	public static void main(String args[]) {
		Sender1 send=new Sender1();
		ThreadSender1 s1= new ThreadSender1("Hi", send);
		ThreadSender1 s2=new ThreadSender1("Bye", send);
		
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
