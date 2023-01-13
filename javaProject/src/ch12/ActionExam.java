package ch12;

abstract class Action{
	
	public abstract void exec();
	
}

public class ActionExam extends Action {

	@Override
	public void exec() {
		System.out.println("I am Child");
		
	}
	public static void main(String[] args) {
		
		Action a = new ActionExam() {
			String name = "kim";
			@Override
			public void exec() {
				System.out.println("나는"+name+"이다");
			}
		};//익명클래스의 
		a.exec();
				
	}

}
