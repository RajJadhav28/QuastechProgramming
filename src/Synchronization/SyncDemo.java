package Synchronization;
//synchronize the sender object inside run() method.
class Sender{
	public void send(String msg) {
		System.out.println("Sending\t"+msg);
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			System.out.println("Thread Interrupted.");
		}
		System.out.println("\n"+msg+"sent");
		}
}
//An alternate implementation to demonstrate
//that we can use synchronized with method also.

//class Sender {
//public synchronized void send(String msg)
//{
//    System.out.println("Sending\t" + msg);
//    try {
//        Thread.sleep(1000);
//    }
//    catch (Exception e) {
//        System.out.println("Thread interrupted.");
//    }
//    System.out.println("\n" + msg + "Sent");
//}
//}

//One more alternate implementation to demonstrate
//that synchronized can be used with only a part of  
//method

//class Sender  
//{
//public void send(String msg)
//{
//    synchronized(this)
//    {
//        System.out.println("Sending\t" + msg );
//        try  
//        {
//            Thread.sleep(1000);
//        }  
//        catch (Exception e)  
//        {
//            System.out.println("Thread interrupted.");
//        }
//        System.out.println("\n" + msg + "Sent");
//    }
//}
//}
class ThreadSend extends Thread{
	private String msg;
	Sender sender;
	ThreadSend(String m, Sender obj){
		msg=m;
		sender=obj;
	}
	public void run() {
		synchronized(sender) {
			sender.send(msg);
		}
	}
}
public class SyncDemo {
	public static void main(String args[]) {
		Sender send=new Sender();
		ThreadSend s1=new ThreadSend("Hi", send);
		ThreadSend s2=new ThreadSend("Bye", send);
		
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
