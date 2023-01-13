package ch11;

public class StudentUse {

	public static void main(String[] args) {
		
		Sinfo sf = new Sinfo();
		
		System.out.println("이름\t주소\t\t이메일");
		sf.adress("홍길동", "서울시 강남구", "hong@gmail.com");
		
		System.out.println();
		System.out.println("------------------------------------------");
		System.out.println();
		
		System.out.println("국어\t수학\t영어\t총점\t평균");
		sf.point("홍길동",90, 85, 79);
		// TODO Auto-generated method stub

	}

}
