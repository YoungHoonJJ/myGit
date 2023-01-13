package ch13;

public class Exam {

	public static void main(String[] args) {
		String a = "hello"; //String pool 영역에 저장
		System.out.println(System.identityHashCode(a));
		String b = "hello";
		System.out.println(System.identityHashCode(b));
		// TODO Auto-generated method stub
		System.out.println(a==b);
		
		String c = new String("hello");
		System.out.println(System.identityHashCode(c));
		
		String d = new String("hello");
		System.out.println(System.identityHashCode(d));
		
		System.out.println(c.equals(d));// 내용이 같냐?

	}

}
