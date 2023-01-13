package ch06;

import java.util.Scanner;

public class HolidayEx {
	
	static int y;//전역변수, 멤버변수(클래스 전체에서 사용할 수 있는 변수)
	
	static void input() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("근속연수를 입력하세요 :");
		y = sc.nextInt();
		
		sc.close();
	}
	
	
	static int holiday(int year) {
		
		int day = 0; //day는 지역변수로 해당 메소드 안에서만 쓸수 있음
		if(year <=5 ) { //근속년수 1~5;
			day=10;//10일 휴가
		}else if(year <=10) { //근속년수 6~10년 이하
			
			day=15;
		}else {
			day=20;
		}
		return day;
	}
	

	public static void main(String[] args) {

		input();
		System.out.println("휴가일수 : "+holiday(y));
		
	}

}
