package ch06;


public class StudentPoint {
	
	
	static int[] hakbun = {1001,1002,1003};
	static String[] name = {"홍길동","사임당","이순신"};
	static int[] java = {90,95,84};
	static int[] db = {85,79,92};
	static int[] html = {99,88,95};
	static int[] jsp = {76,92,72};
	static int[] tot = {0,0,0};
	static double[] avg = {0,0,0};
	
	
	static void getPerson() {  // 전체 학생수 
		System.out.println("전체학생수 :"+name.length+"명");
	}
	
	
	static void getTot() { //총점 기능
		
		for(int i=0; i<3; i++) {
			
			tot[i] = java[i]+db[i]+html[i]+jsp[i];
			
		}
		
	}
	
	static void getAvg() { // 평균 기능

		for(int i=0; i<3; i++ ) {
			
			avg[i] = tot[i]/4.0;
		}
		
	}
	
	static void print() { // 프린트 기능
		
		System.out.println("------------------------------------------------------------------");
		System.out.println("학번\t이름\tJAVA\tDB\tHTML\tJSP\t총점\t평균");
		System.out.println("------------------------------------------------------------------");
		
		for(int i=0; i<3; i++){
			
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%d\t%.1f\n",hakbun[i],name[i],java[i],db[i],html[i],jsp[i],tot[i],avg[i]);
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		getPerson();
		getTot();
		getAvg();
		print();
	}

}
