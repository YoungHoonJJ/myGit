package ch11;

public class ControllableDemo {

	public static void main(String[] args) {
		Tv t = new Tv();
		t.turnOn();
		t.turnOff();
		t.remoteOn();
		t.remoteOff();
		t.repair();
		
		Controllable.reset();//staitc 메소드 클래스이름.메소드로 접근 가능하다.

		
		Computer com = new Computer();
		com.turnOn();
		com.turnOff();
		com.repair();
		Controllable.reset();
		
		Notebook not = new Notebook();
		not.turnOn();
		not.turnOff();
		not.repair();
		Controllable.reset();
	}

}
