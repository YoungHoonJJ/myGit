package ch03;

//비트 연산자
public class Bit {
	
	public static void main(String[] args) {
		
		System.out.println( 3 | 5 ); // 0011 | 0101 => 0111(7)
		System.out.println( 3 & 5 ); // 0011 & 0101 => 0001(1)
		System.out.println( 3 ^ 5 ); // 0011 & 0101 => 0110(6)  두개중 하나가 틀려야 true
		
	}

}
