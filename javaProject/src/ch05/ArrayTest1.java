package ch05;

public class ArrayTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]s = new int[10]; //10개의 배열 지정
		
		for(int i=0; i<s.length; i++) {
			
			s[i] = i;
			
			System.out.print(s[i]+" ");
			
		}

	}

}
