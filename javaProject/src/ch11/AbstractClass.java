package ch11;

public abstract class AbstractClass { //하나라도 추상메소드가 들어오면 추상클래스가 된다
	
	void method() {
		
		System.out.println("완성된 method");
	}
	
	abstract void method1();//추상메소드

}
