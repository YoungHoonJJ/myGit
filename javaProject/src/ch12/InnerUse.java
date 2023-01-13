package ch12;

import ch11.Flyer;

public class InnerUse {

	public static void main(String[] args) {
		
		Flyer f = new Flyer() {//new 생성자() {}; => 무명클래스 
			
			@Override
			public void takeOff() {
				System.out.println("take off");
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void land() {
				
				System.out.println("land");
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void fly() {
				
				System.out.println("fly");
				// TODO Auto-generated method stub
				
			}
		};
		f.takeOff();
		f.fly();
		f.land();
		
		// TODO Auto-generated method stub

	}

}
