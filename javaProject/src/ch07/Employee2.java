package ch07;

import java.text.DecimalFormat;

public class Employee2 {
	
	private String name;
	private String part;//부서
	private String position;//직위
	
	private int basic;//기본급
	private String basic_1;// 기본급 소수점 처리  (뭔가 비효율 적인듯;;)
	
	private int bonus;//보너스(기본급의 300%)
	private String bonus_1;//보너스(기본급의 300%)
	
	
	private int total;//총액(기본급+보너스)
	private String total_1;
	
	private int tax;//세액(총액의 3.3%)
	private String tax_1;
	
	private int salary;//실수령액(총액-세액)
	private String salary_1;//실수령액(총액-세액)
	
	
	
	
	public String getName() {
		name = "김철수";
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	public String getPart() {
		part = "관리부";
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	
	
	
	
	public String getPosition() {
		position = "과장";
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	
	
	
	public int getBasic() {		
		basic = 1914440; // 기본급
	
		return basic;
	}

	public void setBasic(int basic) {
		this.basic = basic;
	}
	
	
	
	
	public String getBasic_1() {
		DecimalFormat df = new DecimalFormat("###,###원");
		
		basic = 1914440; // 기본급
		basic_1 = df.format(basic);
		
		return basic_1;
	}	
	public void setBasic_1(String basic_1) {
		this.basic_1 = basic_1;
	}
	
	
	
	
	public int getBonus() {
		bonus = basic*3;//보너스(기본급의 300%)
		return bonus; 
	}
	public void setBonus(int bonus) {
		
		this.bonus = bonus;
	}
	
	
	
	
	public String getBonus_1() {
		DecimalFormat dd = new DecimalFormat("###,###원");
		
		bonus = basic*3;
		bonus_1 = dd.format(bonus);
		
		return bonus_1; 
	}
	public void setBonus_1(String bonus_1) {
		
		this.bonus_1 = bonus_1;
	}
	
	
	
	
	public int getTotal() {
		total = basic+bonus;
		return total; ////총액(기본급+보너스)
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	
	
	
	public String getTotal_1() {
		DecimalFormat dd = new DecimalFormat("###,###원");
		total = basic+bonus;
		total_1 = dd.format(total);
		return total_1; ////총액(기본급+보너스)
	}
	public void setTotal_1(String total_1) {
		this.total_1 = total_1;
	}
	
	
	
	
	public int getTax() {
		//tax = total*3.3;
		return tax;  ////세액(총액의 3.3%)
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	
	
	
	
	public String getTax_1() {
		
		DecimalFormat dd = new DecimalFormat("###,###원");
		
		tax = (int)(basic*0.033);
		tax_1 = dd.format(tax);
		
		//tax = total*3.3;
		return tax_1;  ////세액(총액의 3.3%)
	}
	public void setTax_1(String tax_1) {
		this.tax_1 = tax_1;
	}
	
	
	
	

	public int getSalary() {
		
		salary = total-tax;//실수령액(총액-세액)
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
	
	
	public String getSalary_1() {
		DecimalFormat dd = new DecimalFormat("###,###원");
		
		salary = total-tax;//실수령액(총액-세액)
		salary_1 = dd.format(salary);
		
		
		
		return salary_1;
	}
	public void setSalary_1(String salary_1) {
		this.salary_1 = salary_1;
	}
	
	
	
	
	
	
	public void print() {
		
		System.out.println("이름\t부서\t직위\t기본급\t\t보너스\t\t총액\t\t세액\t\t실수령액");
		System.out.println(getName()+"\t"+getPart()+"\t"+getPosition()+"\t"+getBasic_1()+"\t"
							
							+getBonus_1()+"\t"+getTotal_1()+"\t"+getTax_1()+"\t\t"+getSalary_1());
		//System.out.println(name+"\t"+part+"\t"+position+"\t"+basic+"\t"+bonus);
		//+total+"\t"+tax+"\t"+salary);
	}
	

}
