package ch05;

import java.util.Scanner;


public class ArrayScore2d_Scan {

	 public static void main(String[] args) {
	        
		 	int haksangsu;

	        Scanner sc = new Scanner(System.in);

	        System.out.print("학생수를 입력하세요 : ");
	        haksangsu = sc.nextInt();   //학생수를 받아온다
	        
	        
	        
	        int[][] score = new int[haksangsu][3];

	        // 국영수 점수 받기
	        System.out.println("국,영,수 점수를 각각 입력하세요 :");
	        for (int i = 0; i < score.length; i++) {
	            System.out.printf("%d번 학생의 점수 :",i+1);
	            for (int j = 0; j < score[i].length; j++) {
	                score[i][j] = sc.nextInt(); // 점수를 각각 받아온다
	            }
	        }

	        int[] sum = new int[score.length];
	        char grade;

	        String[] str = new String[score.length];
	        for (int i = 0 ;i<str.length;i++){
	            
	        	str[i] = (i + 1) + "   ";
	        }

	        
	        System.out.println("번호  국어 영어  수학  총점  평균   등급");
	        
	        
	        
	        for (int i = 0; i < score.length; i++) {
	        	
	            for (int j = 0; j < score[i].length; j++) {
	            	
	                if (String.valueOf(score[i][j]).length() == 3) {
	                	
	                    str[i] += " " + score[i][j] + " ";
	                    
	                } else {
	                	
	                    str[i] += "  " + score[i][j] + " ";
	                }
	                sum[i] += score[i][j];
	            }
	            grade = sum[i] / 3 >= 90 ? 'A' : sum[i] / 3 >= 80 ? 'B' : sum[i] / 3 >= 70 ? 'C' : sum[i] / 3 >= 60 ? 'D' : 'F';
	            str[i] += " " + sum[i] + "  ";
	            if (sum[i] / 3.0 == 100) {
	            	
	                str[i] += String.format("%.1f", sum[i] / 3.0);
	                
	            }else {
	                str[i] += String.format("%.1f", sum[i] / 3.0) + " ";
	            }
	            str[i] += "  " + grade;
	        }
	        for (String i : str) {
	            System.out.println(i);
	        }
	    }
}

	


