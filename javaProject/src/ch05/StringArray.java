package ch05;

public class StringArray {

	public static void main(String[] args) {
		
		String[] str = {"Java","DB","JSP","HTML"};
		
		for(int i=0; i < str.length; i++) {
			
			System.out.println(str[i]);
			
		// 확장for문(for~each문,향상된 for 문) ==> jdk1.5부터 가능
			
		// for(개별값 저장 변수 : 집합 변수 ){}
			
		for(String ss: str) {
			
			System.out.println(ss);
		}
			
		}
		// TODO Auto-generated method stub

	}

}
