package ch05;

public class GetMin {

	public static void main(String[] args) {
		
		int s[] = {55,12,1,3,4,5,6,7,8,10};
		
		int mini = s[0];
		
		for(int i=1; i<s.length; i++) {
			
			if(s[i] < mini) {
				mini = s[i];
				
			}
			
		
			
		}
		System.out.print("최소값은 : "+mini);
		// TODO Auto-generated method stub

	}

}
