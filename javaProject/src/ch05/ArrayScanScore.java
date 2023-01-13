package ch05;

import java.util.Scanner;

public class ArrayScanScore {

	public static void main(String[] args) {
		
		int hak;  //학생의 수
		int sum=0;
		double avg=0;
		//int[] sung; //성적
		//int[] sung; //= new int[2];
		//int point;
		
		//int[] tot;  //성적합계
		//double[] avg; //평균
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생의 수를 입력하세요");
		hak = sc.nextInt(); //학생의 수 받아옴
		
		int[] sung = new int[hak];
		
		for(int i=0; i<sung.length; i++) {
			
			System.out.print("점수를 입력하세요 : ");
			sung[i] = sc.nextInt();
			
			sum +=sung[i];
			avg = (double)sum/(double)hak; //타입 변환
			
			
			
		}
		
		sc.close(); //스캐너 종료
		
		System.out.println();//한칸 뛰기
		System.out.println("총점은"+sum+"점 입니다.");
		System.out.printf("평균성적은 %.2f점 입니다.",avg); //소숫점 표시
		
		// 합계 및 평균 구하기
		
		/*int[] tot = new int[hak];
		//double[] avg = new double[hak];	
		
		for(int i=0; i<sung.length; i++) {
			
			tot[i] = sung[i]+sung[i];
			//avg[]
			
		}
		*/
		
		
		
		
		/*for(int i=0; i<hak; i++) {
			
			sung = new int[hak];
			System.out.print("점수를 입력하세요 : ");
			sung[i] = sc.nextInt();
			//point = sc.nextInt();
			//sung = new int[i];		
			//sung[i] = sc.nextInt(); //학생의 수만큼 점수 입력
			System.out.println(sung[i]);
		*/
		}
		
		
		
		
		
		
		
		/*
		 * 
		 * 
		 * 출력결과 :

성적처리할 학생수를 입력하세요 : 3

성적을 입력하세요 : 98

성적을 입력하세요 : 75

성적을 입력하세요 : 65

​

총점은 000점 입니다.

평균성적은 00.0점 입니다.
		 */

	}


