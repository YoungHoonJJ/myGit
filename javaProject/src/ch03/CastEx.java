package ch03;

public class CastEx {

	//자료형 변환
	
	public static void main(String[] args) {

	float f = 1.6f; //4바이트
	System.out.println(f);

	f = 100; //자동형변환(정수 100을 자동으로 float형 실수 100.0f 로 변환)
	System.out.println(f);
	
	f = 100.5f;
	int i = (int)f; // 강제형 변환, 명시적 변환
					// 정수보다 실수가 더 크다
					// 그래서 강제적으로 변환을 시켜주어야한다.
	
	System.out.println(i);
	}

}
