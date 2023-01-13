package ch12;

public class InnerExam3 {
	
	public void enec() {
		
		class Cal{//메소드 안에 class선언(지역중첩클래스)
		
			int value = 0;
		public void plus() {
			
			value++;
		}
			
		}
		
		Cal cal = new Cal();
		cal.plus();
		System.out.println(cal.value);
	}

	public static void main(String[] args) {
		InnerExam3 t = new InnerExam3();
		t.enec();
		// TODO Auto-generated method stub

	}

}
