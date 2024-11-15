package InnerClass;

public class MemberOuterClass {
		private int data=30;
	class Inner{
		void msg() {
			System.out.println("data is:"+data);
			}
	}
	public static void main(String args[]) {
		MemberOuterClass obj=new MemberOuterClass();
		MemberOuterClass.Inner in=obj.new Inner();
		in.msg();
	}

}
