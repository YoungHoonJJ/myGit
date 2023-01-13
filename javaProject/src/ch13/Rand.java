package ch13;

import java.util.Random;

public class Rand {

	public static void main(String[] args) {
		Random r = new Random();
		
		System.out.println(r.nextDouble());
		System.out.println(r.nextInt(100));//0~99
		System.out.println(r.nextInt(101)+200);
		// TODO Auto-generated method stub

	}

}
