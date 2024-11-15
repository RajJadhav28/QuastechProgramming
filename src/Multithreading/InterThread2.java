
//
//class customer{
//	int amount=10000;
//	synchronized void withdraw1(int amount) {
//		System.out.println("going to withdraw...");
//		
//		if(this.amount<amount) {
//			System.out.println("Less balance, waiting for deposite.");
//			try {
//				wait();;
//			}catch(Exception e) {}
//		}
//		this.amount-=amount;
//		System.out.println("withdraw completed.");
//	}
//	synchronized void deposite1(int amount) {
//		System.out.println("going to deposite.");
//		this.amount+=amount;
//	}
//}
//public class InterThread2 {
//	public static void main(String args[]) {
//		Customer c=new Customer();
//		new Thread() {
//			public void run() {
//				c.withdraw(15000);
//			}
//		}.start();
//		new Thread() {
//			public void run() {
//				c.deposite(10000);
//			}
//		}.start();
//	}
//
//}
