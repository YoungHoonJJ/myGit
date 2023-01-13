package ch05;

import java.util.Scanner;

public class ArrayPoint2 {

	public static void main(String[] args) {
		
		String[] name = new String[2];
		
		
		int[] kor = new int[2];
		//int[] kor = {100,90,111,111,111};
		
		int[] eng = new int[2];
		
		int[] mat = new int[2];
		//int[] eng = {80,70,11,111,111};
		//int[] mat = {70,60,11,111,111};
		
		
		int[] tot = new int[2];
		double[] avg = new double[2];
		//double tot_avg = 0;
		
		System.out.println("2명의 학생이름을 각각 입력 하세요.");
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<name.length; i++){
		
			System.out.print("이름을 입력하세요. :");
			name[i] = sc.next();
			
			System.out.print("국어점수를 입력하세요. :");
			kor[i] = sc.nextInt();
			
			System.out.print("영어점수를 입력하세요. :");
			eng[i] = sc.nextInt();
			
			System.out.print("수학점수를 입력하세요. :");
			mat[i] = sc.nextInt();
		
		}
		
		sc.close();
		
		
		for(int i=0; i<name.length; i++) {
			
			tot[i] = kor[i]+eng[i]+mat[i];
			avg[i] = tot[i]/3.0;
			
		}
		
		
		
		
		
		for(int i=0; i<name.length; i++) {
			
		//System.out.println(name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+mat[i]+"\t"+tot[i]+"/t"+String.format("%1.f", avg[i]));
		System.out.println("이   름 : "+name[i]);
		System.out.println("국어점수 : "+kor[i]);
		System.out.println("수학점수 : "+eng[i]);
		System.out.println("영어점수 : "+mat[i]);
		System.out.println("총   점 : "+tot[i]);
		//System.out.printf("평   균 : %.2f",avg[i]);
		//sysou
		System.out.println("평   균 :"+String.format("%.2f", avg[i]));
		System.out.println("");
			
		}
		
		//System.out.println("학급평균 : "+String.format("%1.f", tot_avg/5));
		
		
		

	}
}


