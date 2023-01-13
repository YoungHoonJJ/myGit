package ch06;

public class ParamEx {
	
	//매개변수 2개이상
	static int plus(int a, int b) {
		return a+b;
		
	}
	static int minus(int a, int b) {
		
		return a-b;
	}
	static int multi(int a, int b) {
		
		return a*b;
	}
	static int divide(int a, int b) {
		
		return a/b;
	}
	

	public static void main(String[] args) {
		
		int n;
		
		n = plus(10, 20);
		System.out.println("plus : "+n);
		
		n = minus(30, 20);
		System.out.println("minus : "+n);
		
		n = multi(100, 20);
		System.out.println("multi : "+n);
		
		n= divide(150, 20);
		System.out.println("divide : "+n);

	}

}
