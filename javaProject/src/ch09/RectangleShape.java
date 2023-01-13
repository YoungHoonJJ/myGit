package ch09;

public class RectangleShape extends Shape {
	
	private int width;
	private int height;
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public RectangleShape(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	@Override
	public double calculateArea() {
		return width * (double)height;
	}
	
	public void draw() {
		System.out.println("가로가"+width+"세로가"+height+"인 직사각형");
		super.draw();
	}
	
	

}
