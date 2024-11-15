package Constructor1;

public class CopyConstructor {
	int a;
	int b;
	String name;
	CopyConstructor(int a, int b, String name){
		this.a=a;
		this.b=b;
		this.name=name;
	}
	CopyConstructor(CopyConstructor obj){
		this.a=obj.a;
		this.b=obj.b;
		this.name=obj.name;
	}
	void display(){
		System.out.println("a:"+a+" b:"+b+" name:"+name);
	}
	public static void main(String args[]) {
		CopyConstructor obj=new CopyConstructor(1,11,"Raj");
		CopyConstructor obj1=new CopyConstructor(obj);
		
		obj.display();
		obj1.display();
	}

}
