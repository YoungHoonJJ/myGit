package ch13;


//인스턴스를 복제하려면 Cloneable를 implements해야한다.
public class Clone implements Cloneable {
	int num = 10;
	void print() {
		System.out.println(num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clone t1 = new Clone();
		Clone t2 = null;
		
		try {//예외가 발생할 가능성의 코드
			
			t2 = (Clone)t1.clone();//인스턴스를 복제, clone()은 Object의 메소드 이기 때문에
			//좌변과 맞추기 위해(Clone)형 변환해야한다.
		} catch (Exception e) {//예외가 발생될때 작동
			e.printStackTrace();//개발자를 위한 디버깅 정보 제공
		}
		System.out.println(t1);
		System.out.println(t2);
		
		System.out.println();
		t1.print();
		t2.print();
	}

}
