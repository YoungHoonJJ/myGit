package ch02;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		System.out.println(num % 2 == 0? "짝수" : "홀수");
		// a%b a를 b로 나눈 나머지값
		
		// 3항 연산자 1항 ? 2항(true) : 3항(false)
		
		sc.close();
	}

}
