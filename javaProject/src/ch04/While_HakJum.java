package ch04;

import java.util.Scanner;

public class While_HakJum {

	public static void main(String[] args) {
/* 전체 성적입력이 끝나면 마지막에 -1을 입력하세요. 
아무정수나 입력하세요 : 4
국어 : 88
영어 : 77
수학 : 88
계속하려면 아무정수나 입력하세요 : 1
국어 : 88
영어 : 99
수학 : 66
계속하려면 아무정수나 입력하세요 : -1
===========================
국어  영어  수학  총점  평균  등급
------------------------------------------
88    77     88     000   00.0   우
88    99     66     000   00.0   ?
===========================*/
		int num;
		int kor,eng,mat; //과목
		int tot; //총점
		double avg; // 평균
		String grade="";//등급
		String result="";
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아무정수나 입력하세요 : ");
		num = sc.nextInt();
		
		if(num != -1) {
			
		while(true) {
			
			System.out.print("국어 :");
			kor = sc.nextInt();
			
			System.out.print("영어 :");
			eng = sc.nextInt();
			
			System.out.print("수학 :");
			mat = sc.nextInt();
			
			tot = kor+eng+mat;  //합계
			avg = tot/3.0; 		//평균값
			
			if(tot>290) {
				
				grade = "수";
			}else if(tot > 280) {
				
				grade = "우";
			}else if(tot > 270) {
				
				grade = "미";
			}else if(tot > 260) {
				
				grade = "양";
			}else if(tot > 250) {
				
				grade = "가";
			}else {
			
				grade = "재시험";
			}
			
			result += kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+String.format("%.2f",avg)+"\t"+grade +"\n"; //String .format 
			//result += grade;
			
			System.out.print("계속하려면 아무정수나 입력하세요 : (-1입력시 종료)");
			num = sc.nextInt();
			
			if(num < 0) { //
				break;
			}
			
		}
		
		}
			System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
			System.out.println("================================================");
			System.out.println(result);
			
			sc.close();
	
		}
				
	}

		
		
		
		
	


