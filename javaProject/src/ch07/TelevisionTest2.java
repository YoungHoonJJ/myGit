package ch07;

public class TelevisionTest2 {

	public static void main(String[] args) {
		
		Televison myTv = new Televison();
		System.out.println(myTv);
		
		myTv.channel = 7;
		myTv.volume = 10;
		myTv.onOff = true;
		System.out.println("나의 텔레비전의 채널은"+myTv.channel+"이고 볼륨은"
				
				+myTv.volume+"입니다");
		
		Televison yourTv = new Televison();
		System.out.println(yourTv);
		yourTv.channel = 9;
		yourTv.volume = 12;
		yourTv.onOff = false;
		
System.out.println("너의 텔레비전의 채널은"+yourTv.channel+"이고 볼륨은"
				
				+yourTv.volume+"입니다");
		
		

	}

}
