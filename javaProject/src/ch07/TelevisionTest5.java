package ch07;

public class TelevisionTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Televison myTv = new Televison();
		myTv.setChannel(11);
		int ch = myTv.getChannel(); //ch=11
		
		System.out.println("현재 채널은"+ch+"입니다.");

	}

}
