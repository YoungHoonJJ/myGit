package ch08;

public class Auction {
	
	private String name;
	private String userid;
	private int money;
	private String grade;
	
	public Auction () {
		this.name = "홍길동";
		this.userid = "hong";
		this.money = 150000;
		
		if(money >=100000) {
			
			this.grade = "GOLD";
		}else {
			
			this.grade = "SILVER";
		}
		
	}
	
	public void Info() {
		
		System.out.println("이름\t아이디\t구매금액\t등금");
		System.out.println(name+"\t"+userid+"\t"+money+"\t"+grade);
	}

}
