package ch02;
import java.util.Scanner; //Ctrl + Shfit + O

public class ScannerEx {
	
	public static void main(String[]args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("첫번째 정수값을 입력하시오 : ");
		int a = in.nextInt();
		
		System.out.println("두번째 정수값을 입력하시오 : ");
		int b = in.nextInt();
		
		System.out.printf("첫번째 + 두번째 합계 = "+(a+b));
		
		in.close();
		
	}

	

	}


