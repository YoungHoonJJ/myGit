package ch04;

import java.util.Scanner;

public class Nested_If_Score {
	
	public static void main(String[] args) {
		
		String name;
		int score;
		char grade;
		char lev =' ';
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생의 이름을 입력하세요 : ");
		name = sc.next();
		
		System.out.print("점수를 입력 하세요 : ");
		score = sc.nextInt();
		
		sc.close();
		
		
		
		if (score > 90) {   //대 if 문 
			
			grade = 'A';
			
			if (score > 97) { // 그속 안의 if문  
			
			lev = '+';
				
			}else if (score < 94) {
				
			lev = '-';
				
			}
			
		}else if (score > 80) {
			
			grade = 'B';
			
			if (score > 87) {
				
				lev = '+';
				
			}else if (score < 84) {
				
				lev = '-';
			
			}
			
		}else if (score > 70) {
			
			grade = 'C';
			
			if (score > 77) {
				
				lev = '+';
				
			}else if (score < 74) {
				
				lev = '-';
				
			}
			
		}
		
		
		
	else {
			System.out.println("====================================");
			grade = 'F';
			System.out.println("재수강자 대상입니다.");
		}
		
		
		System.out.println("====================================");
		System.out.printf("%s님의 점수는 %d점 이고 등급은 %s%s 입니다.",name,score,grade,lev);

		
		
	}

}
