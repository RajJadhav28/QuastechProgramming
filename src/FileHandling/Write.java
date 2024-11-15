package FileHandling;
import java.io.FileWriter; 

//Import the IOException class for handling errors
import java.io.IOException; 

public class Write {
	public static void main(String args[]) {
		try {
			FileWriter Writer= new FileWriter("D:myfile.txt");
			Writer.write("Files in java are seriously good.");
			Writer.close();
			System.out.println("Successfully Written.");
		}catch(IOException e) {
			System.out.println("An error has occured!!!");
			e.printStackTrace();
		}
	}

}
