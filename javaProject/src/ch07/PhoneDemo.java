package ch07;

//한개의 파일에 2개 이상의 class를 작성할때는 main메소드가 있는 public class를 클래스이름으로 지정 해야함
// 다른 파일은 접근 제어지정자가 default로 처리되어야 함
class Phone{
	
	String model;
	int value;
	void print() {
		System.out.println(value+"만원 짜리"+model+"스마트폰");
	}
}







public class PhoneDemo { //실행파일

	public static void main(String[] args) {
		
		Phone myPhone = new Phone();//객체생성
		myPhone.model = "객럭시";
		myPhone.value = 100;
		myPhone.print();
		
		Phone yourPhone = new Phone();//객체생성
		yourPhone.model = "아이폰";
		yourPhone.value = 100;
		yourPhone.print();
		
		// TODO Auto-generated method stub

	}

}
