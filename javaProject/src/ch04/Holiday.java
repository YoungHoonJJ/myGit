package ch04;

import java.util.Scanner;

//휴가일수 계산
//근속연수 1~3년 => 3일, 4~9년 => 5일
//10년 이상 =>10일  , 20년 이상 => 20일
public class Holiday {

	public static void main(String[] args) {
		
		//변수 선언
		
		int year;
		int days;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("근속연수를 입력하세요 : ");
		year = sc.nextInt();
		
		sc.close();
		
		if (year <= 3 ) { //이하
			
			days = 3;
			
		}else if (year < 10) {
			
			days = 5;
		}else if (year < 20) {
			
			days = 10;
			
		}else {// 그 이외의 모든것
			
			days = 20;
		}
		
		System.out.println("당신의 근속연수는 " +year+"년 이고");
		System.out.println("휴가일수는 "+days+"일 입니다.");

	}

}
