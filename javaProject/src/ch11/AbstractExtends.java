package ch11;

//추상클래스를 쓰는 이유는 표준화(유지보수의 이유)때문.
//추상클래스를 인스턴스를 만들 수 없음
//추상메소드를 자식클래스에서
public class AbstractExtends extends AbstractClass {

	@Override
	void method1() {
		System.out.println("추상 method를 완성한 method");
		
	}
	public static void main(String[] args) {
		
		//AbstractClass ex = new AbstractClass //추상클래스는 객체새성이 안된다.
		ex.method1();
		ex.method2();
	}

}
