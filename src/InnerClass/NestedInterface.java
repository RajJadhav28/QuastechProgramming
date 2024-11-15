package InnerClass;

interface Showable{
	void show();
	interface Message{
		void msg();
	}
}

public class NestedInterface  implements Showable.Message{
	public void msg() {
		System.out.println("Hello nested Interface.");
	}
//	public void show() {
//		System.out.println("Hello nested Interface1");//it won't print it
//	}
	public static void main(String args[]) {
		Showable.Message message=new NestedInterface();
		message.msg();
	}

}
