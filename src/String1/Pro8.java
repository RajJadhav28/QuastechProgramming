package String1;

public class Pro8 {

	public static void main(String[] args) {
		String s1="Welcome to World.";
		char ch[]=s1.toCharArray();
		int length=ch.length;
		System.out.println("Length:"+length);
		for(int i=0;i<length;i++) {
			System.out.print(ch[i]);
		}
	}
}
