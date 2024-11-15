package Constructor1;


public class ConstructorOverloading {
	int a;
	int b;
	String name;
	ConstructorOverloading(int a, String name){
		this.a=a;
		this.name=name;
	}
	ConstructorOverloading(int a, int b, String name){
		this.a=a;
		this.b=b;
		this.name=name;
	}
	void display() {
		System.out.println("a:"+a+" b:"+b+" name:"+name);
	}
	public static void main(String args[]) {
		ConstructorOverloading obj=new ConstructorOverloading(10,20,"raj");
		ConstructorOverloading obj1=new ConstructorOverloading(10,"raj");
		obj.display();
		obj1.display();
		
	}

}
