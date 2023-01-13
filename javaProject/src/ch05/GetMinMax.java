package ch05;


public class GetMinMax {

	public static void main(String[] args) {
		
		int [] num = {79, 88, 91, 33, 100, 55, 95};
		
		int max =0;
		int min = num[0];
		
		
		for(int i = 0; i<num.length; i++) {
			
			if(num[i] > max) {
				
				max = num[i];
			}
			
			if(num[i] < min) {
				
				min = num[i];
			}
			
			//System.out.println(num[i]);
			
			
			
			
		}
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		
		// TODO Auto-generated method stub
		
		

	}

}
