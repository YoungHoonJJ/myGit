package ch03;

public class BitNot {
	
	public static void main(String[] args) {
		
		byte a = 10;
		System.out.println(a); //1010
		
		//~ 연산자(비트값을 반전시킴, 0을 1로, 1을 0으로 바꾸는제 실제로 계산시에는 첫번째로 반전시키고
		// 다시한번 반전 시킬때는 오른쪽 끝비트를 제외하고 반전시킨 후 앞의 부호도 반전시킨다.)
		
		
		System.err.println(~a); //~not a   0101 => -1011(-11)
		
	}

}
