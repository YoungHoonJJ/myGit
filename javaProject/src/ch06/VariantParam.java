package ch06;

public class VariantParam {

	//자료형 ...변수 => 가변사이즈 매개변수, 변수가 배열 참조 변수가됨.
	public static void main(String[] args) {
		
		
		print("java");
		print("java","program");
		print("java","program","jsp");

	}
	
	static void print(String ... n) { //은 가변형 매개변수(배열처리의 주소값)가 됨
		
		for(int i=0; i<n.length; i++) {
			
			System.out.println(n[i]);
		}
	}

//	static void print(String a, String b, String c) {
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		
//	}
//
//	static void print(String a, String b) {
//		
//		System.out.println(a);
//		System.out.println(b);
//		
//	}
//
//	static void print(String a) {
//		
//		System.out.println(a);
//		
//	}

}
