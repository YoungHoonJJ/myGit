package ch05;

public class Array3Dim {
	//3차원 배열 : 배열명 = new 자료형[면][행][열]
	public static void main(String[] args) {
		
		
		//2면 3행 4열
		String[][][] subject = {{{"1","2","3","4"}//과목코드
		,{"JSP","알고리즘","파이썬","자료구조"} //과목명
		,{"홍길동","전영훈","이순신","이몽룡"}},
				
				{
			{"CS01","CS02","CS03","CS04"}
					,{"생활영어","경제학","생활체육","음악"}
					,{"김영철","청경제","김민호","조수민"}
					}};
		
			//subject[0][0][0] = "JS01", subject[0][0][1] = "AL02"....
		
		for(int i=0; i<subject.length; i++) { //면
			for(int j=0; j<subject[i].length; j++) { //행
				for(int k=0; k<subject[i][j].length; k++) {//열
					
					System.out.println("["+i+"]["+j+"]["+k+"] :"+subject[i][j][k]);
				}
				
			}
			System.out.println("=============================================");
		}//end outer for

	}

}
