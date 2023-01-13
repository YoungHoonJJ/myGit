package ch03;

public class CompareEx {
	
	public static void main(String[] args) {
		
		int a = 65;//아스키 값으로 A다
		char c = 'A';  //단문자의 기본 작은 따옴표다
		//String e = "e"; // 장문자 String 은 큰따옴표다
		System.out.println(a==c);// 좌변과 우변이 같으면 true / 아니면 false, 비교연산자
		System.out.println(a=c); // 대입 연산자
		System.out.println( c != 65 ); // c가 65가 아니냐? not Equal
		
	}

}
