package ch05;

public class ArrayBasic {
	public static void main(String[] args) {
		
		//int[] score; //배열참조변수 선언
		
		//score = new int[5]; //NEW를 통해 메모리에 5개의 INT형 자리를 준비
		// 배열 생성(4byte x 5 = 20byte)
		
		//System.out.println(score);
		
		/*
		
		score[0] = 100;
		score[1] = 100;
		score[2] = 100;
		score[3] = 100;
		score[4] = 100;
		
		*/
		
		int[] score = {100,90,80,70,60};
		
		
		
		for(int i =0 ; i<5; i++) {
			
			System.out.println(score[i]);
			//System.out.println(score[1]);
			//System.out.println(score[2]);
			//System.out.println(score[3]);
			//System.out.println(score[4]);
		}
		
	}

}
