package ch04;

import java.util.Scanner;

public class ForPoint {

	public static void main(String[] args) {
		
		//int kor=10;
		//int eng=10;
		
		//int kor[] = new int[3];
		
		int kor[] = new int[3];
		int eng[] = new int[3];
		int mat[] = new int[3];
		int sum[] = new int[3]; // 합계
		double avg[] = new double[3];//평균
		String grade[] = new String[3]; //등급
		
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
		
			System.out.print("국어 :");
			kor[i] = sc.nextInt();
			
			System.out.print("영어 :");
			eng[i] = sc.nextInt();
			
			System.out.print("수학 :");
			mat[i] = sc.nextInt();
		
		}
		
		sc.close();
		
		System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
		
		for(int j=0; j<3; j++) {
			
			sum[j] = kor[j]+eng[j]+mat[j];
			avg[j] = sum[j]/3.0;
			
			if(sum[j] > 300) {
				
				grade[j] = "수";
			}else if(sum[j] > 280){
				
				grade[j] = "우";
			}else if(sum[j] > 260) {
				
				grade[j] = "미";
			}else if(sum[j] > 240) {
				
				grade[j] = "양";
			}else if(sum[j] >220) {
				
				grade[j] = "가";
			}else {
				
				grade[j] = "불합격";
			}
			
			System.out.printf("%d\t%d\t%d\t%d\t%.2f\t%s\n",kor[j],eng[j],mat[j],sum[j],avg[j],grade[j]);
			
			
		}
		
	}
        
}