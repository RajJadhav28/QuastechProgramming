package Multithreading;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable{
	private String taskName;
	public Task(String str) {
		taskName=str;
	}
	public void run() {
		try {
			for(int j=0;j<=5;j++) {
				if(j==0) {
					Date dt=new Date();
					SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss");
					System.out.println("Initialization time for the task name:"+taskName+"="+sdf.format(dt));
				}else {
					Date dt=new Date();
					SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss");
					System.out.println("Initialization time for the task name:"+taskName+"="+sdf.format(dt));
				}
				Thread.sleep(1000);
			}
			System.out.println(taskName+" is complete.");
		}catch(Exception ie) {
			ie.printStackTrace();
		}
	}
}
public class ThreadPoolExample {
	static final int MAX_TH=3;
	public static void main(String args[]) {
		Runnable rb1=new Task("task1");
		Runnable rb2=new Task("task2");
		Runnable rb3=new Task("task3");
		Runnable rb4=new Task("task4");
		Runnable rb5=new Task("task5");
		
		ExecutorService pl=Executors.newFixedThreadPool(MAX_TH);
		pl.execute(rb1);
		pl.execute(rb2);
		pl.execute(rb3);
		pl.execute(rb4);
		pl.execute(rb5);
		pl.shutdown();
	}
}
