package ch01;

public class Hello {

	public static void main(String[] args) {
		// 주석(프로그램에 영향을 주지 않는다.)
		System.out.println("hello"); //println 의 ln은 줄바꿈처리를 의미
		
		System.out.println("sysout + ctrl + Space를 누르면 자동완성");
		System.out.println(args); //[Ljava.lang.String;@15db9742
		//Ctrl + F11 : 실행을 누르면 아래 2단계를 걸쳐서 출력이 된다.
		/* 
		   1) javac - 자바 소스를 바이트 코드로 변환하는 컴파일러
	       2) java - jre의 bin 디렉터리에도 있는 자바 응용프로그램 실행기
         */
		

	}

}
