package InnerClass2;

interface A3{
	void show(int i); 
}
public class LambdaExpression2 {
	public static void main(String[] args) {
//		A3 obj=(int i)->{
//				System.out.println("Anonymous inner class");
//				
//			
//		};
		
//		If we have pny one variable we don't need to have curly brases 
//		nor also the data type
		A3 obj= i-> System.out.println("Anonymous inner class:"+i);
			
		

		obj.show(5);
	}
}
