package ch10;

public class StaticMethod2 {
	
	static int num=10; //사번
	static String name="홍길동";
	String email="hong@gmail.com";
	String hp="010-1234-5678";
	String addr="서울 강남구 역삼동";
	
	public static void print1() {
		
		StaticMethod2 s = new StaticMethod2();
		System.out.println("===print1()===");
		System.out.println("사번 :"+num);
		System.out.println("이름 :"+name);
		System.out.println("이메일 :"+s.email);
		System.out.println("전화 :"+s.hp);
		System.out.println("주소 :"+s.addr);
	}
	
	public void print2() {
		System.out.println("===print2()===");
		System.out.print("사번 :"+num+"\n"+"이름 :"+name+"\n"+"이메일 :"+email+"\n"
		+"전화 :"+hp+"\n"+"주소 :"+addr);
	}

	public static void main(String[] args) {
	
		print1();
		
		StaticMethod2 s2 = new StaticMethod2();
		s2.print2();

	}

}
