package ch05;



public class Array2Point2 {

	public static void main(String[] args) {
		
		//5행 3열
		//int [][] score = {{10,20,30},{30,40,50},{50,60,70},{30,40,50},{30,30,40}};
		
		int [][] score;
		
		score = new int[5][3];
		
		score[0][0] = 10;
		score[0][1] = 20;
		score[0][2] = 30;
		score[1][0] = 40;
		score[1][1] = 50;
		score[1][2] = 60;
		score[2][0] = 70;
		score[2][1] = 80;
		score[2][2] = 100;
		score[3][0] = 100;
		score[3][1] = 100;
		score[3][2] = 80;
		score[4][0] = 70;
		score[4][1] = 80;
		score[4][2] = 50;
		
		
		

		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		
		for(int i=0; i<score.length; i++) {
			
			int sum = 0; //총점
			float avg = 0.0f; //평균
			System.out.printf("%d\t",i+1);// 번호 출력
			
			for(int j=0; j<score[i].length; j++) {//국영수 배열값 처리
				
				System.out.println("점수 입력 : ");
				
				sum += score[i][j];
				System.out.printf("%d\t",score[i][j]);
			}
			
			avg = sum/(float)score[i].length; //평균 계산
			
			//출력
			System.out.printf("%d\t %.1f\n",sum,avg);
		} //end outer for
		
		

	}

}
