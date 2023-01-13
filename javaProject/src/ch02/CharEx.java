package ch02;

public class CharEx {

	public static void main(String[] args) {
		char aValue = '\u0041';
		System.out.println("char형('\u0041') : "+aValue); //유니코드로 인식하여 대문자 A로 인식
		char bValue = '\u0041';
		System.out.println("char형(\'\\u0041\') : "+bValue);
		// \ '=> Single Qutoe 표현
		// \\ => Backslash를 표현
		

	}

}
