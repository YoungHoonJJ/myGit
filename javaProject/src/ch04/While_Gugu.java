package ch04;

import java.util.Scanner;



public class While_Gugu {

	public static void main(String[] args) {
		
		int n = 1;
		int dan;
		
		int gu;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 숫자를 입력하세요");
		dan = sc.nextInt(); 
		
		sc.close();
		
		
		do {
			
			gu = dan*n;
			System.out.printf("%d X %d = %d \n",dan,n,gu);
			n++;
			
			
		} while (n<10);
		
		System.out.println("출력이 완료 되었습니다.");

	}

}
