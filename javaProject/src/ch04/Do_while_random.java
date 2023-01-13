package ch04;

import java.util.Scanner;


public class Do_while_random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 0;
		
		int answer = 0;
		
		answer = (int)(Math.random()*10)+1;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.print("1과 10사이의 정수를 입력하세요 >");
			String tmp = sc.next();
			
			input = Integer.parseInt(tmp); //문자형을 숫자형으로 변환 "1" =>1 중요@@!!
			
			if(input > answer) {
				System.out.println("더 작은수로 시도해보세요");
				
			}else if(input < answer){	
				System.out.println("더 큰수로 시도해보세요");	
			}
			
		}while(input != answer);
		
		sc.close();
		System.out.println("정답입니다.");
		

	}

}
