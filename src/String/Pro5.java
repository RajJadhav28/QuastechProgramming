package String;

public class Pro5 {

	public static void main(String[] args) {
		String s1="Quastech training institute";
		int c=0;
		System.out.print("Total number of char values:");
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)!=' ') {
				c++;
			}
		}
		System.out.print(c);
		int c1=0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)==' ') {
				c1++;
			}
		}
		
		System.out.println("\nTotal number of spaces:"+c1);
		String word[]=s1.trim().split("\\s+");
		int wordcount=word.length;
		System.out.println("Total number of words:"+wordcount);
		System.out.println("Total number of words:"+(c1+1));
		
		
	}

}
