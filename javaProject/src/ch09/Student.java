package ch09;

public class Student {
	
	//protected String name;
	//protected String num;
	//protected String major;
	//protected int year;
	private String name;
	private String num;
	private String major;
	private int year;

	//생성자
	public Student() {
		
		
	}
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getNum() {
		return num;
	}



	public void setNum(String num) {
		this.num = num;
	}



	public String getMajor() {
		return major;
	}



	public void setMajor(String major) {
		this.major = major;
	}



	public int getYear() {
		return year;
	}



	public void setYear(int year) {
		this.year = year;
	}

	public Student(String name, String num, String major, int year) {
		super();
		this.name = name;
		this.num = num;
		this.major = major;
		this.year = year;
	}
	//상속관계의 클래스들에서는 생성보다는 메소드를 잘 활용한다.
	public void input(String name, String num, String major, int year) {
		this.name = name;
		this.num = num;
		this.major = major;
		this.year = year;
	}
	

}
