package Constructors;

class Geek1 {
    // data members of the class.
    String name;
    int id;
 
    // Parameterized Constructor
    Geek1(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
 
    // Copy Constructor
    Geek1(Geek1 obj2)
    {
        this.name = obj2.name;
        this.id = obj2.id;
    }
}
public class CopyConstructor {
	 public static void main(String[] args)
	    {
	        // This would invoke the parameterized constructor.
	        System.out.println("First Object");
	        Geek1 geek1 = new Geek1("avinash", 68);
	        System.out.println("GeekName :" + geek1.name
	                           + " and GeekId :" + geek1.id);
	 
	        System.out.println();
	 
	        // This would invoke the copy constructor.
	        Geek1 geek2 = new Geek1(geek1);
	        System.out.println(
	            "Copy Constructor used Second Object");
	        System.out.println("GeekName :" + geek2.name
	                           + " and GeekId :" + geek2.id);
	    }

}
