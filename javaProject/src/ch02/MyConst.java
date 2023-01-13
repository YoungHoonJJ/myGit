package ch02;

public class MyConst {

	public static void main(String[] args) {
		//final를 붙여 상수
				final double pie = 3.14;
				double circle; // 원
				double half = 10.0; //반지름
				circle = half*half*pie ; // 원의 넓이 구하는 공식
				
				System.out.println("출력: ");
				System.out.println("원의면적 : " + circle);

	}

}
