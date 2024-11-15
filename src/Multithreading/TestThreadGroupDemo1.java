package Multithreading;

class NewThread1 extends Thread{
	NewThread1(String threadname, ThreadGroup tgob){
		super(tgob, threadname);
		start();
	}
	public void run() {
		for(int i=0;i<1000;i++) {
			try {
				Thread.sleep(10);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		
		System.out.println(Thread.currentThread().getName()+" finished execution.");
	}
}
public class TestThreadGroupDemo1 {
	public static void main(String args[]) throws InterruptedException{
		ThreadGroup gfg=new ThreadGroup("gfg");
		ThreadGroup gfg_child=new ThreadGroup(gfg,"child");
		
		NewThread1 t1=new NewThread1("one",gfg);
		System.out.println("Starting one");
		NewThread1 t2=new NewThread1("two",gfg);
		System.out.println("Starting two");
		if(gfg.isDaemon()==true) {
			System.out.println("Group is Deamon");
		}else {
			System.out.println("Not a Deamon Group");
		}
		if(gfg.isDestroyed()==true) {
			System.out.println("Group destroyed.");
		}else {
			System.out.println("Group not destroyed.");
		}
		if(gfg.parentOf(gfg_child)==true) {
			System.out.println(gfg.getName()+" is parent of "+gfg_child.getName());
		}else {
			System.out.println(gfg.getName()+" is not parent of "+gfg_child.getName());
		}
		System.out.println("number of active thread group:"+gfg.activeGroupCount());
		System.out.println("number of active threads:"+gfg.activeCount());
		System.out.println("name of the parent threadgroup:"+gfg.getName());
		System.out.println("name of child threadgroup:"+gfg_child.getName());
		System.out.println("\nListing parent ThreadGroup:"+gfg.getName()+":");
		gfg.list();
	}

}
