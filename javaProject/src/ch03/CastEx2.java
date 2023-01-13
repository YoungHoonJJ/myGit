package ch03;

public class CastEx2 {

	public static void main(String[] args) {
		
		
		int a = 500;
		float b = 200.2f;
		int c = 127; //byte 는 -128 ~ +127 까지
		
		double d = a;
		
		System.out.println("int a => double : "+ d );
		//작은 타입에서 큰 타입으로 변환 가능
		
		int e = (int)b; //명시적 형변환 강제적 형변환 , 다운캐스팅
		
		System.out.println("float b => int : "+e );
		
		byte f = (byte)c;
		System.out.println("int c = > byte : "+ f);

	}

}
