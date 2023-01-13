package ch03;

public class AndOrEx {
	
	public static void main(String[] args) {
		
		int a = 7;
		//논리연산자 && , ||
		System.out.println( a > 5 && a < 0 ); //  %% = and  둘중 하나만 false 면 false 우선
		System.out.println( a > 5 || a < 0);//    || = or  둘중 하나가 true 면 true 우선
		
	}

}
