package ch06;

public class ReturnEx {
	
	//리턴값이 있는 메소드
	
	public static int sum(int a) { //리턴타입 int
		
		int result = 0;
		for(int i=0; i<=a; i++) {
			
			result = result + i;
		}
		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=sum(2);
		
		System.out.println(n);
		
		n=sum(100);
		
		System.out.println(n);

	}

}
