package ch09;

public class ManagerTest {

	public static void main(String[] args) {
		
		Manager ma = new Manager();
		
		ma.input(1, "전영훈", "경기도 안산시 선부광장로77", "bambii@kakao.com", 3000, "880208-1******");
		
		ma.bonuscal();
		ma.print();
		// TODO Auto-generated method stub

	}

}
