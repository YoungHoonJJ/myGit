package ch09;

/*
 * private int num; //사번

	public String name; //이름

	String adress; //주소

	String email; //이메일

	protected int salary; //연봉

	private String rrn; //주민번호
 */

public class Manager extends Employee {
	
	private int bonus;
	
	public void input(int num, String name,String adress,String email,int salary,String rrn) {
		
		setNum(num);
		this.name = name;
		this.adress = adress;
		this.email = email;
		this.salary = salary;
		setRrn(rrn);
		
	}
	
	public void bonuscal() {
		
		bonus = (int)(salary*0.3);
	}
	
	public void print() {
		
		System.out.println("================================");
		System.out.println("사   번 : "+getNum());
		System.out.println("이   름 : "+name);
		System.out.println("주   소 : "+adress);
		System.out.println("이 메 일 : "+email);
		System.out.println("주민번호 : "+getRrn());
		System.out.println("연   봉 : "+salary+"만원");
		System.out.println("보 너 스 : "+bonus+"만원");
		System.out.println("===============================");
	}

}
