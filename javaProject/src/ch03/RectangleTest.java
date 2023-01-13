package ch03;

import java.util.Scanner;


//전영훈 과제
public class RectangleTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===============================");
		
		
		
		System.out.println("직사각형의 가로 길이를 입력하세요 : ");
		double width = sc.nextDouble();
		
		System.out.println("직사각형의 세로 길이를 입력하세요 : ");
		double height = sc.nextDouble();
		
		
		double plus = width*height;
		
		System.out.println("직사각형의 넓이는"+plus+"입니다.");
		//System.out.printf("직사각형의 넓이는 %d 입니다.",plus);
		
		
		System.out.println("===============================");
		
		sc.close();
		

	}

}
