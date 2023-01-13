package ch06;

public class PointEx {
	
	static String[] name = {"홍길동","전영훈","오은정","전영진","박지성"};
	static int[] kor = {100,100,100,100,100};
	static int[] eng = {100,100,100,100,100};
	static int[] mat = {100,100,100,100,100};
	static int[] tot = {0,0,0,0,0};
	static double[] avg = {0.0,0.0,0.0,0.0,0.0};
	
	static void student() {
		
		
	}
	
	
	
	static void getTot() { //총점 기능
		
		for(int i=0; i<5; i++) {
			
			tot[i] = kor[i]+eng[i]+mat[i];
		}
	}
	
	static void getAvg() { //평균 기능
		
		for(int i=0; i<5; i++) {
			
			avg[i] = tot[i]/3.0;
			
		}
	}
	
	static void print() {
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		
		for(int i=0; i<5; i++) {
			
			System.out.println(name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+mat[i]+"\t"+tot[i]+"\t"+String.format("%.1f", avg[i]));
			
			
			
		}
	}
	
	

	public static void main(String[] args) {
		
		
		
		getTot();
		getAvg();
		print();

	}

}
