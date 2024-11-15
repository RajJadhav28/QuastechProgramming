package InnerClass;

public class MemberOuterClass2 {
	private int data=40;
	class Inner{
		void msg() {
			System.out.println("data is:"+data);
		}
	}
	public static void main(String args[]) {
		MemberOuterClass2 m2=new MemberOuterClass2();
		MemberOuterClass2.Inner in= m2.new Inner();
		in.msg();
	}

}
