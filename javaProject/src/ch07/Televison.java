package ch07;

public class Televison {

		//멤버변수(전역변수)
		

		int channel;
		int volume;
		boolean onOff; //전원상태 boolean은 기본적으로 false로 초기화됨.
						//onOff = false onOff = true
		
		void print() {
			
			System.out.println("채널은"+channel+"이고 볼륨은"+volume+"입니다");
		}
		
		int getChannel() {
			return channel;
		}
		
		void setChannel(int ch) {
			
			channel = ch;
		}

	

}
