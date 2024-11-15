package ThrowThrows;
import java.io.*;

class M{
	void method()throws IOException{
		throw new IOException("device error.");
	}
}
public class Pro2 {
	public static void main(String args[]) {
		try {
			M m=new M();
			m.method();
		}catch(Exception e) {
			System.out.println("Exception handeled.");
		}
		System.out.println("normal flow!!!");
	}

}
