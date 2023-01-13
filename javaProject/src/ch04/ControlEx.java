package ch04;

import java.util.Scanner;

public class ControlEx {

	public static void main(String[] args) {
		
		int menu = 0;
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		outer:
			
		while(true) {
			
			System.out.println("(1) 제곱");
			System.out.println("(2) 제곱근");
			System.out.println("(3) 로그");
			System.out.println("원하는것 을 선택하세요 1~3  종료:0");
			
			String tmp = sc.next();
			menu = Integer.parseInt(tmp);
			
			
			if(menu==0) {
				
				System.out.println("프로그램을 종료합니다");
			}else if(menu < 1 || menu > 3) {
				
				System.out.println("메뉴를 잘못선택했습니다. 종료는 0");
				continue;
				
			}
			
			for(;;) {
				System.out.println("계산할 값을 입력하세요.(계산종료:0, 전체종료:99)");
				tmp = sc.next();
				num = Integer.parseInt(tmp);
				
				if(num==0)
					break;
				if(num==99)break outer; //전체종료
				
				switch (menu) {
				case 1:
					
					System.out.println("result : "+num*num); //제곱
					break;
					
				case 2:
					System.out.println("result : "+Math.sqrt(num)); //제곱
					break;
					
				case 3:
					System.out.println("result : "+Math.log(num)); //제곱
					break;

				}
			}
			
			
		}
		sc.close();
	}

}
