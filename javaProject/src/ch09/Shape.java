package ch09;

public class Shape { //extends Object
	private String name;
	public Shape() {
		super(); //Object 클래스의 기본생성자 호출
	}
	
	public Shape(String name) {
		
		super();
		this.name = name;
	}
	public String getName() { //멤버 메소드
		
		return name;
	}
	
	public double calculateArea() {//멤버메소드
		
		return 0;
	}
	
	public void draw() {
		
		System.out.println("도형을 그립니다.");
	}

	

}
