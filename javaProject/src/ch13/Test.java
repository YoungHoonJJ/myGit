package ch13;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		System.out.println(Math.ceil(10.1));
		System.out.println(Math.ceil(10.5));
		System.out.println(Math.floor(10.9));
		System.out.println(Math.pow(10,3));
		
		
		
		System.out.println(Math.ceil(10.1));
		
		Random ran = new Random();
		System.out.println("정수값 : "+ran.nextInt(100));//100이하의 정수랜덤
		System.out.println("실수값 : "+ran.nextDouble());
		
		int a=10;
		Integer b=20;//1.5이하버전에서는 에러, intValue()가 작동
		Integer c=new Integer(30);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		// TODO Auto-generated method stub

	}

}
