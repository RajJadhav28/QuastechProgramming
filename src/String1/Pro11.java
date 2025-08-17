package String1;

public class Pro11 {

	public static void main(String[] args) {
		String s1="Javatpointtt";
		System.out.println("Returning words:");
		String arr[]=s1.split("t",0);
		for(String w:arr) {
			System.out.println(w);
		}
		System.out.println("Split array length:"+arr.length);

	}

}
