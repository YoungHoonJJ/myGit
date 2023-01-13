package ch07;

public class TelevisionTest3 {

	public static void main(String[] args) {
		
		Televison myTv = new Televison();
		
		myTv.channel = 7;
		myTv.print();
		
		
		Televison youTv = new Televison();
		youTv.channel = 11;
		youTv.print();
	}

}
