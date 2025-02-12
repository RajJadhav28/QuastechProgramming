package Multithreading;

class NewThread extends Thread{
	NewThread(String threadname, ThreadGroup tgob){
		super(tgob, threadname);
		start();
	}
	public void run() {
		for(int i=0;i<1000;i++) {
			try {
				Thread.sleep(10);
				}catch(Exception e) {
					System.out.println("Exception encountered.");
				}
		}
	}
}
public class ThreadGroupDemo {
	public static void main(String args[]) {
		ThreadGroup gfg=new ThreadGroup("parent thread group.");
		NewThread t1=new NewThread("one", gfg);
		System.out.println("Starting one.");
		
		NewThread t2=new NewThread("two",gfg);
		System.out.println("Starting two");
		
		System.out.println("number of active threads:"+gfg.activeCount());
		
		System.out.println(gfg.getName());
	}

}
