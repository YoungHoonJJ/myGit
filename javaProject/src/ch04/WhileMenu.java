package ch04;

import java.util.Scanner;

public class WhileMenu {

	public static void main(String[] args) {
		
		int menu = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {  //true 무한반복
			
			System.out.println("(1) 아메리카노");
			System.out.println("(2) 식혜");
			System.out.println("(3) 카라멜마끼야또");
			System.out.print("원하는 메뉴를( 1~3 ) 선택하세요 (종료 : 0)");
			
			String tmp = sc.nextLine(); //문자입력
			menu = Integer.parseInt(tmp); //문자받은걸 숫자로 변환
			
			if(menu == 0) {
				
				System.out.println("프로그램을 종료합니다.");
				break;
			}else if(menu < 1 || menu > 3){
				
				System.out.println("메뉴를 잘못 선택하였습니다.(종료는 0)");
				continue;
			}
			
			System.out.println("선택하신메뉴는"+menu+"번 입니다.");
			
		}
		sc.close();

	}

}
