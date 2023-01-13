package ch12;

public class MemberOuter {
	
	private int num = 1;
	private String name = "홍길동";
	private String mail ="hong@gmail.com";
	
	class TestInner{
		void info() {
			
			System.out.println("고객번호 :"+num);
			System.out.println("이름 :"+name);
			System.out.println("이메일 :"+mail);
		}
		
	}
	
	public static void main(String[] args) {
		
		MemberOuter mo = new MemberOuter();
		MemberOuter.TestInner mt = mo.new TestInner();
		
		mt.info();
		
		
		
		
		
	}

}
