package ch04;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		long fact = 1; //팩토리얼 처리 값이 커질것 같아서 long로 정의
		//3!=3x2x1
		int n;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 :");
		n = sc.nextInt();
		
		sc.close();
		
		for(int i=1; i<=n; i++) {
			
			fact = fact * i;
		}
		System.out.printf("%d!은 %d입니다. ",n,fact);
			

	}

}
