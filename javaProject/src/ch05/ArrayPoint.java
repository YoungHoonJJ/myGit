package ch05;

public class ArrayPoint {

	public static void main(String[] args) {
		
		String[] name = {"홍길동","전영훈","111","222","333"};
		
		int[] kor = {100,90,111,111,111};
		int[] eng = {80,70,11,111,111};
		int[] mat = {70,60,11,111,111};
		
		
		int[] tot = {0,0,0,0,0};
		double[] avg = new double[5];
		double tot_avg = 0;
		
		
		
		for(int i=0; i<5; i++) {
			
			tot[i] = kor[i]+eng[i]+mat[i];
			avg[i] = tot[i]/3.0;
			tot_avg=tot_avg+avg[i];
		
		}
		
		
		
		
		
		for(int i=0; i<5; i++) {
			
		//System.out.println(name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+mat[i]+"\t"+tot[i]+"/t"+String.format("%1.f", avg[i]));
		System.out.println("이름 : "+name[i]);
		System.out.println("국어점수 : "+kor[i]);
		System.out.println("수학점수 : "+eng[i]);
		System.out.println("영어점수 : "+mat[i]);
		System.out.println("총   점 : "+tot[i]);
			
		}
		
		//System.out.println("학급평균 : "+String.format("%1.f", tot_avg/5));
		
		
		

	}
}


