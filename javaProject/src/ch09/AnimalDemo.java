package ch09;

class Animal{
	public Animal(String s) {
		System.out.println("동물 : "+s);
	}
}

class Mammal extends Animal{
	public Mammal() {
		super("원숭이");//부모 클래스의 생성자 호출
		System.out.println("포유류 : 원숭이");
		// TODO Auto-generated constructor stub
	}
	
	public Mammal(String s) {
		super(s);
		
		System.out.println("포유류 : "+s);
	}
}

public class AnimalDemo {

	public static void main(String[] args) {
		
		Mammal ma = new Mammal();//객체 성성 및  기본 생성자 호출
		Mammal lion = new Mammal("사자"); //매개변수가 있는 생성자 호출
		
		// TODO Auto-generated method stub

	}

}
