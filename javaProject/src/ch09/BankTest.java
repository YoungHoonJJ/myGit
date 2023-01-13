package ch09;

class Bank{
	
	double getInterestRate() { //Bank의 멤버메소드
		return 0.0;
	}
}
class BadBank extends Bank{
	
	//@ : 어노테이션(Annotation)이라고 하며 컴파일러에게 추가정보 제공
	//주석으로 활용하거나 또는 프로그램에게 특정기능을 정의하거나 실행하도록 정보 제공용으로 사용한다.
	// 스프링에서는 본격적으로 활용한다.
	@Override
	double getInterestRate() { //메소드 오버라이딩(재정의)
		return super.getInterestRate();
	}
	
class NomalBank extends Bank{
	
	@Override
	double getInterestRate() {
		// TODO Auto-generated method stub
		return super(5.0);
	}
}

class GoodBank extends Bank{
	
	@Override
	double getInterestRate() {
		// TODO Auto-generated method stub
		return 3.0;
	}
}

}

public class BankTest {
	public static void main(String[] args) {
		
		BadBank b1 = new BadBank();//객체 생성
		NomalBank b2 = new NomalBank();
		GoodBank b3 = new GoodBank();
		System.out.println(b1.getInterestRate());
	}

}
