package ja02;
/*
 * 문제1] StrBuildEx.java

	"I am a" - str1 변수사용
	
	" Java Programmer" = str2 변수사용
	
	​
	
	출력결과 :
	
	--------------------------------------------------------------
	
	append()메소드를 활용 : "I am a Java Programmer"
	
	replace()를 활용 : "I am a JSP Programmer"
	
	substring()을 활용 : "JSP Programmer"
	
	--------------------------------------------------------------
 * 
 */
public class StrBuildEx {

	public static void main(String[] args) {
		
		String str1 ="I am a ";
		String str2 ="Java Programmer";
		
		StringBuilder sb = new StringBuilder();
		sb.append(str1);
		sb.append(str2);
		System.out.println("append()메소드를 활용 : "+sb);
		
		
		sb.replace(7, 12, "jsp ");//i am a@Java@Programmer @~@까지
		System.out.println("replace()를 활용 : "+sb);
		
		
		System.out.println("substring()을 활용 : "+sb.substring(7));
		
		
		
		
		// TODO Auto-generated method stub

	}

}
