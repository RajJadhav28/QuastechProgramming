package Synchronization;

class Sender2{
	public void send(String msg) {
		System.out.println("Sending\t"+msg);
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("\n"+msg+" sent");
	}
	
}
class ThreadSend2 extends Thread{
	private String msg;
	Sender2 sender2;
	ThreadSend2(String m, Sender2 obj){
		msg=m;
		sender2=obj;
	}
	public void run() {
		synchronized(sender2) {
			sender2.send(msg);
		}
	}
}
public class SyncDemo3 {
	public static void main(String args[]) {
		Sender2 send=new Sender2();
		ThreadSend2 s1=new ThreadSend2("Hi", send);
		ThreadSend2 s2=new ThreadSend2("Bye", send);
		
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
