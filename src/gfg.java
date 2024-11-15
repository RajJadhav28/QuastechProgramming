
public class gfg {
	static String Employee_name;
	static float Employee_salary;
	
	gfg(String n, float p) {
		Employee_name=n;
		Employee_salary=p;
	}
	void display() {
		System.out.println(Employee_name+" "+Employee_salary);
	}
	public static void main(String args[]) {
		gfg obj=new gfg("Raj",25000);
		obj.display();
		
	}

}
