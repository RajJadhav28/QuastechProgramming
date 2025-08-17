package Multithreading1;

public class Pro2 implements Runnable{
	public void run() {
		System.out.println("thread is running...");
	}
	public static void main(String[] args) {
	Pro2 p2=new Pro2();
	Thread t1= new Thread(p2);
	t1.start();
	
//	If you are not extending the Thread class, your class object would not be treated as a thread object. 
//	So you need to explicitly create the Thread class object. 
//	We are passing the object of your class that implements Runnable so that your class run() method may execute.

	}

}
