package ch05;

public class ArrayScore2D {

	public static void main(String[] args) {
		//5행 3열
				int [][] score = {{100,100,91},{100,100,90},{100,100,71},{100,100,60},{30,30,40}};
				
				char grade = ' ';
				/*int [][] score;
				
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
				*/
				
				
				

				System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t등급");
				
				for(int i=0; i<score.length; i++) {
					
					int sum = 0; //총점
					float avg = 0.0f; //평균
					System.out.printf("%d\t",i+1);// 번호 출력
					
					for(int j=0; j<score[i].length; j++) {//국영수 배열값 처리
						
						sum += score[i][j];
						System.out.printf("%d\t",score[i][j]);
						
						if(sum > 290) {
							
							grade = 'A';
						}else if(sum > 280) {
							
							grade = 'B';
						}else if(sum > 270) {
							
							grade = 'C';
						}else {
							
							grade = 'F';
						}
						
					}
					
					avg = sum/(float)score[i].length; //평균 계산
					
					//출력
					System.out.printf("%d\t %.1f\t%s\n",sum,avg,grade);
				} //end outer for
				
				

			}


	}


