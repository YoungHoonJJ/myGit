package ch08;

public class Member {
	
	private String name;
	private String userid;
	private int money;
	private String grade;
	
	public Member(String name,String userid, int money,String grade) {
		
		this.name = name;
		this.userid = userid;
		this.money = money;
		this.grade = grade;
		
		if(this.money > 100000) {
			
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
