package ch09;

public class Volume extends Area{
	
	private int height;
	public Volume() {
		
	}
	public Volume(int width, int length, int height) {
		super(width,length);//super는 부모생성자 불러오는거
		this.height = height;
	}
	
	//메소드
	public int getVolume() {
		return getArea()*height;
	}

}
