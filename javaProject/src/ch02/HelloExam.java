package ch02;

public class HelloExam {
	
	
	//사용자 정의 메소드
	public static int sum(int n, int m) { //메소드 n=20 , m=10
		
		return n + m;
	}
	
	//프로그램의 시작은 메인메소드 부터
	public static void main(String[] args) { //메인메소드(실행메소드)
		
		int i = 20; // 지역 변수 초기화(할당)
		int s; // 선언만
		char a; //지역변수 선언만
		
		s = sum(i,10); //s=30; sum은 위에 사용자 정의 메소드에서 불러온것 (20+10)
		a = '?';
		
		System.out.println(a);
		System.out.println("HELLO");
		System.out.println(s);
		
		
		
	}

}
