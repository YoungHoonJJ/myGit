package ch03;

import java.util.Scanner;

//국어, 영어, 수학 점수를 입력받아 총점, 평균, 출력
public class Point {

	public static void main(String[] args) {
		
		String name;
		int kor, eng, math, tot;
		double avg;
		
		Scanner p = new Scanner(System.in);
		System.out.println("이름 : ");
		name = p.next();
		
		System.out.println("국어 점수 : ");
		kor = p.nextInt();
		
		System.out.println("영어 점수 : ");
		eng = p.nextInt();
		
		System.out.println("수학 점수 : ");
		math = p.nextInt();
		
		p.close();
		
		
		tot = kor+eng+math;
		avg = tot/3.0;
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+avg);
		
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f",name,kor,eng,math,tot,avg);
		
		System.out.println();
		
		System.out.println(String.format("%s\t%d\t%d\t%d\t%d\t%.1f",name,kor,eng,math,tot,avg));
		
		
	}

}
