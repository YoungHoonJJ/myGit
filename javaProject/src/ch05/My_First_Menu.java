package ch05;

import java.util.Scanner;

public class My_First_Menu {

	public static void main(String[] args) {
		
		int menu = 0;
		//int tmp;
		int num;
		//Stirng tmp = "";
		
		Scanner sc = new Scanner(System.in);
		
		outer:// Label 처리
			
			while(true)
			{
				
				System.out.println("== [메뉴] ==");
				System.out.println("(1) 한식");
				System.out.println("(2) 중식");
				System.out.println("(3) 양식");
				System.out.println("원하는 메뉴 (1)~(3) 을 선택하세요. (종료:0) ");
				menu = sc.nextInt();
				
				if(menu==0) {
					
					System.out.println("프로그램을 종료합니다");
					break;
				}else if(menu<1 || menu>3) {
					
					System.out.println("메뉴를 잘못선택 종료는0");
					
					
				}
				
				if(menu == 1) { //1번 선택하면
				
				switch (1) {
				case 1:
					
					for(;;) {
						
						System.out.println("[한식메뉴]");
						System.out.println("(1) 김치찌개");
						System.out.println("(2) 된장찌개");
						System.out.println("(3) 삼겹살");
						System.out.println("(4) 비빔밥");
						System.out.println("한식메뉴를 선택하세요.(한식메뉴선택종료:0, 전체종료:99)>");
						
						num = sc.nextInt();
						//num = Integer.parseInt(tmp);
						
						if(num==0) 
							break;
							
						if(num==99) 
							break outer;
							
						switch (num) {
						
							case 1 :
								System.out.println("고객님은 (1)김치찌개를 선택하셨습니다.");
								break;
							case 2 :
							System.out.println("고객님은 (2)된장찌개를 선택하셨습니다.");
								break;
							
							case 3 :
							System.out.println("고객님은 (3)삼겹살를 선택하셨습니다.");
								break;
							
							case 4 :
							System.out.println("고객님은 (4)비빔밥을 선택하셨습니다.");
								break;
						
						}
							
					
					//break
								
					}
				} 
				
				}else if(menu==2){
					
					switch (1) {
					case 1:
						
						for(;;) {
							
							System.out.println("[중식메뉴]");
							System.out.println("(1) 짜장면");
							System.out.println("(2) 짬  뽕");
							System.out.println("(3) 탕수육");
							System.out.println("(4) 팔보채");
							System.out.println("중식메뉴를 선택하세요.(중식메뉴선택종료:0, 전체종료:99)>");
							
							num = sc.nextInt();
							//num = Integer.parseInt(tmp);
							
							if(num==0) 
								break;
								
							if(num==99) 
								break outer;
								
							switch (num) {
							
								case 1 :
									System.out.println("고객님은 (1)짜장면을 선택하셨습니다.");
									break;
								case 2 :
								System.out.println("고객님은 (2)짬뽕을 선택하셨습니다.");
									break;
								
								case 3 :
								System.out.println("고객님은 (3)탕수육을 선택하셨습니다.");
									break;
								
								case 4 :
								System.out.println("고객님은 (4)팔보채를 선택하셨습니다.");
									break;
							
							}
						//break
									
						}
					}
					

				}else if(menu==3) {  //3번 선택하면
					
					switch (1) {
					case 1:
						
						for(;;) {
							
							System.out.println("[양식메뉴]");
							System.out.println("(1)파스타");
							System.out.println("(2)스테이크");
							System.out.println("(3)피   자");
							System.out.println("(4)리 조 또");
							System.out.println("양식메뉴를 선택하세요.(양식메뉴선택종료:0, 전체종료:99)>");
							
							num = sc.nextInt();
							//num = Integer.parseInt(tmp);
							
							if(num==0) 
								break;
								
							if(num==99) 
								break outer;
								
							switch (num) {
							
								case 1 :
									System.out.println("고객님은 (1)파스타를 선택하셨습니다.");
									break;
								case 2 :
								System.out.println("고객님은 (2)스테이크를 선택하셨습니다.");
									break;
								
								case 3 :
								System.out.println("고객님은 (3)피자를 선택하셨습니다.");
									break;
								
								case 4 :
								System.out.println("고객님은 (4)리조또을 선택하셨습니다.");
									break;
							
							}
								
						
						//break
									
						}
					}
					
					
					
					
					
				}
					
					//break;

				}
		
		 	System.out.println("프로그램을 종료합니다.");
				
				
			}//와일문
		
		  
		

	}


