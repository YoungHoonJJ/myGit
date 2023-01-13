package ch12;

interface RemoteControl{
	void turnOn();
	void turnOff();
}

public class AnonymousClassTest {

	public static void main(String[] args) {
		//interface는 new 해서 개게생성을 못하지만 아래처럼
		//무명클래스 처리하면 자동적으로 인터페이스를 무명 클래스가 상속받아
		//오버라이딩 처리 할 수 있다.
		RemoteControl ac =new RemoteControl() {//익명 클래스
			
			@Override
			public void turnOn() {
				System.out.println("tv turnOn();");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("tv turnOff();");
				
			}
		};//무명 내부클래스
		
		ac.turnOff();
		ac.turnOn();
		// TODO Auto-generated method stub

	}

}
