package ArrayList;

class Test4{
	int x,y;
}
class Test44 implements Cloneable{
	int a,b;
	Test4 c=new Test4();
	
	public Object clone() throws CloneNotSupportedException{
		Test44 t=(Test44)super.clone();
		t.c=new Test4();
		t.c.x=c.x;
		t.c.y=c.y;
		return t;
	}
}
public class Clone3 {
	public static void main(String args[]) throws CloneNotSupportedException {
		Test44 t1=new Test44();
		t1.a=10;
		t1.b=20;
		t1.c.x=30;
		t1.c.y=40;
		
		Test44 t2=(Test44)t1.clone();
		t2.a=100;
		t2.c.x=300;
		
		System.out.println(t1.a+" "+t1.b+" "+t1.c.x+" "+t1.c.y);
		System.out.println(t2.a+" "+t2.b+" "+t2.c.x+" "+t2.c.y);
	}

}
