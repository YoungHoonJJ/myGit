package ch04;

public class ContinueEx1 {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			
			//5의 배수를 만나면 출력 하지 않음
			if(i%5==0) continue; //이하코드 무시 다음단계로
			System.out.println(i);
		}
		// TODO Auto-generated method stub

	}

}
