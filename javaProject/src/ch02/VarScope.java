package ch02;

public class VarScope {
	
	static int x;  // 전역 변수는 선언만 해도 된다. 자동초기화가 되기 대문에
	static char y;
	static boolean z;
	static float q;
	
	public static void main(String[] args) {
		
		int a = 0; // 지역변수는 반드시 초기화를 해야한다(값을 지정해주어야한다) int = a (x)
		
		System.out.println("int = "+ x);
		System.out.println("char = "+ y);
		System.out.println("boolean = "+z);
		System.out.println("boolean = "+q);
		System.out.println("a = "+ a);
		
	}

}
