package ch03;

public class TernaryOperator {
	
	public static void main(String[] args) {
		
		int x = 1;
		int y;
		
		y = (x==1)? 10 : 20 ; // ()? -> 질문 던지고 true 면 두번째  false 면 세번째
		
		System.out.println(y);
		
		
		y = (x>1)? x++ : x+20 ;
		
		System.out.println(y);
		
	}

}
