package ch04;

public class Odd_Even {

	public static void main(String[] args) {
		
		int sum1= 0;
		int sum2=0;
		
		for(int i=0; i<=10; i++) {
			
			if (i%2==1) {
				
				sum1+=i; // sum1= sum1+i
				
			}//if 문
			
		}//for 문
		
		System.out.println("1~10사이의 홀수의 합은? : "+sum1);
		
		for(int j=0; j<=10; j++) {
			
			if (j%2==0) {
				
				sum2+=j; // sum1= sum1+i
				
			}//if 문
			
		}//for 문
		
		System.out.println("1~10사이의 짝수의 합은? : "+sum2);

	}

}
