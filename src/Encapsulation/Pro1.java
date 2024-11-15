package Encapsulation;

  class test {
	private int id;
	private String name;
	private String address;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
 }
	public class Pro1{
	public static void main(String args[]) {
		test obj=new test();
		obj.setId(1);
		obj.setName("Raj");
		obj.setAge(26);
		obj.setAddress("Mumbai");
		System.out.println(obj.getId()+" "+obj.getName()+" "+obj.getAge()+" "+obj.getAddress());		
	}
	}


