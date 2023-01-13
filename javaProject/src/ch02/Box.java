package ch02;

public class Box {
	

	public static void main(String[] args) {
		
		double width, length;
		
		width = 10.0;  //가로 
		length = 5.0;  //세로
		

		System.out.println("출력 결과 : ");
		System.out.println("사각형의 넓이 : " + width* length );
		System.out.println("사각형의 둘레 : " + 2.0* (width+length));
		
		
		/*
		 * 공식)

			사각형의 넓이 = 가로 * 세로
			
			사각형의 둘레 = 2.0 * (가로 + 세로)
			
			​
			
			출력 결과 :
			
			사각형의 넓이 : 50.0
			
			사각형의 둘레 : 30.0

		 * 
		 * */

	}

}
