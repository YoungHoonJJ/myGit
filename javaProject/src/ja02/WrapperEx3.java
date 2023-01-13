package ja02;

public class WrapperEx3 {

	public static void main(String[] args) {
		
		
		String ch = "Hello1234";
		
		
		
		System.out.println("(Chracter 사용)");
			for(int i=0; i<ch.length(); i++) {
				if(Character.isUpperCase(ch.charAt(i))) {
					System.out.println(ch.charAt(i)+"는 대문자 입니다.");
				}else if(Character.isLowerCase(ch.charAt(i))) {
					System.out.println(ch.charAt(i)+"는 소문자 입니다.");
				}else if(Character.isDigit(ch.charAt(i))) {
					System.out.println(ch.charAt(i)+"는 숫자 입니다.");
				}
			
		}
			System.out.println();
			System.out.println("---------------------");
			System.out.println();
			
			String ch1 = ch.substring(5); 
			int ch2 = Integer.parseInt(ch1);
			
			String su = "1234";// 문자 비교 대상
			int su1 = 1234;
			
			System.out.println("(Integer 사용)");
			
			
			
			//문자 숫자 확인
			if(su.equals(ch1) ) {
				System.out.println("문자 "+ch1+" 입니다");
			}else {
				System.out.println("문자 변환이 안되었습니다.");
			}
			
			if(ch2==su1) {
				System.out.println("숫자 "+ch1+" 입니다");
			}else {
				System.out.println("숫자 변환이 안되었습니다.");
			}
			
			System.out.println("숫자 "+ch2+"+"+Integer.parseInt(ch.substring(6, 7))+" = "
			+(ch2+Integer.parseInt(ch.substring(6, 7))));
			
			
			
			
			
			

	}

}
