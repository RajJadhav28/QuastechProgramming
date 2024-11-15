package Constructor1;

public class Parameterized {
	int id;
	String name;
	Parameterized(int id, String name){
		this.id=id;
		this.name=name;
	}
	void display() {
		System.out.println("id:"+id+" Name:"+name);
	}
	public static void main(String args[]) {
		Parameterized obj=new Parameterized(11,"Raj");
		obj.display();
	}

}
