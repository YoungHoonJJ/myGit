package ch02;

import java.util.Scanner;

public class Add_Input {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int x; //지역변수
		int y;
		int sum;
		
		
		
		System.out.print("첫 번째 숫자를 입력하세요 :");
		x = input.nextInt();
		System.out.println("두 번째 숫자를 입력하세요 : ");
		y = input.nextInt();
		
		
		sum = x+y;
		System.out.println("두 수의 합은? : "+sum+"입니다");
		
		input.close();
		
		
	}

}
