package ch13;

public class Strbuilder {

	public static void main(String[] args) {
		
		
		StringBuilder str1 = new StringBuilder();
		
		str1.append("java");
		System.out.println(str1.toString());
		str1.append(" programming");
		System.out.println(str1);
		
		str1.replace(0, 4, "jsp");//0~3	
		
		//참고로 replace()메소드는 주로 String 객체의 replace()를 많이 쓰는 편이다.
		System.out.println(str1);
		String str2=str1.substring(3);//인덱스 3~ 끝가지
		System.out.println(str1);
		System.out.println(str2);
		
		String str3=str1.toString();
		System.out.println("StringBuilder(str1) -> String(str3)에 저장 :"+str3);
		
		str1 = new StringBuilder(str3);
		System.out.println("String(str3) -> StringBuilder(str1)에 저장"+str1);

	}

}
