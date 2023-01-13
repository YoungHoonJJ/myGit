package ch10;

/*
 * 사번 : 10

	이름 : 홍길동
	
	이메일 : hong@gmail.com
	
	전화 : 010-1234-5678
	
	주소 : 서울 강남구 역삼동
 */
class Index{
	
	String num = "10";
	String name = "홍길동";
	public void print() {
		
		System.out.println("사번 :"+num);
		System.out.println("이름 :"+name);
		// TODO Auto-generated method stub
		
	}
}


class Info_1 extends Index{
	
	String mail = "hong@gmail.com";
	String phone = "010-1234-5678";
	String adress = "서울 강남구 역삼동";
	
	@Override
	public void print() {
		
		super.print();
		System.out.println("이메일 :"+mail);
		System.out.println("전화 :"+phone);
		System.out.println("주소 :"+adress);
		
	}
	
}

public class Poly3 {
	public static void main(String[] args) {
		
		Index in = new Info_1();
		
		in.print();
		
	}

}
