package ch06;

import java.util.Scanner;

public class Method_Gugu {

	public static void main(String[] args) {
		
		
		int dan;
		
		System.out.print("단을 입력하세요 :");
		Scanner sc = new Scanner(System.in);
		
		dan = sc.nextInt();
		
		gugu(dan);
		
		sc.close();

	}//프로그램 종료

	private static void gugu(int dan) { //void는 리턴 안한다
		
		for(int i=1; i<10; i++) {
			System.out.println(dan+"X"+i+"="+dan*i);
		}
		
	}

}
