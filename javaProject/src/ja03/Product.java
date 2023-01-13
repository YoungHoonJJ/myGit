package ja03;

import java.util.Scanner;

public class Product {
	
	private String sno; //시리얼 넘버
	private String name; //제품 이름
	private String company; //제조회사
	private int money; //단가
	private int count; //수량
	private double price; //금액
	private double tax; //부가가치세
	//private String exit = "";
	
	public void print() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("제품번호 : ");
		sno = sc.next();
		System.out.print("제품이름 : ");
		name = sc.next();
		System.out.print("제조회사 : ");
		company = sc.next();
		System.out.print("단가 : ");
		money = sc.nextInt();
		System.out.print("수량 : ");
		count = sc.nextInt();
		
		tax = (money*0.1);
		
		price = (money+tax*count);
		
		//System.out.println("계속하려면 데이터를 입력해주세요(exit 입력시 종료)");
		//exit = sc.next();
		
		
		
		
	}

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	

}
