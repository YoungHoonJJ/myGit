package ch06;

public class OverloadEx1 {
	
	

	public static void main(String[] args) {
		
		
		print(10.5);
		print("hello");
		print(100);
		print("hi","java");

	}
	
	
	
	private static void print(double a) {
		System.out.println(a);
		// TODO Auto-generated method stub
		
	}
	private static void print(String b) {
		System.out.println(b);
		// TODO Auto-generated method stub
		
	}
	private static void print(int c) {
		System.out.println(c);
		
	}

	private static void print(String a, String b) {
		System.out.println(a);
		System.out.println(b);
		
	}




}
