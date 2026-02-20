package shiftOperators;

public class Pro2 {
	public static void main(String[] args) {
		int a1=5;		//Binary:	0000 0101
		int b1=a1 << 2;	//Shift left by 2 position
		
		//Binary after shift:	0001 0100=20 Formula: x << n = x × 2ⁿ
		System.out.println("b1:"+b1);
		
		int a=-8;		// Binary: 1111 1000 (in two's complement)
		int result=a>>2;// Shift right by 2 positions
		
		// Fills with 1s on left (preserves sign)
		// Result: 1111 1110 = -2
		System.out.println("result:"+result);
		
		int b=8;			// Binary: 0000 1000
		int result2= b>>2;	// Shift right by 2
		// Fills with 0s on left
				// Result: 0000 0010 = 2
		
	}
}
