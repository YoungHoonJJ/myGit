package ch04;

import java.util.Scanner;

public class While_Point {

	public static void main(String[] args) {
		
		int total = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("더할 값을 입력하세요 : ");
		int num = sc.nextInt();
		
		while(num !=0) {
			
			total += num; //total = num+total
			System.out.println("현재 누적된 값 : "+total);
			System.out.println("계속 입력하세요.(종료를 원하면 0을 입력)");
			num = sc.nextInt();
		}
		
		System.out.println("총 누적합 : "+total);
		System.out.println("프로그램을 종료합니다.");
		sc.close();

	}

}
