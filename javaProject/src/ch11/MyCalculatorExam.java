package ch11;

public class MyCalculatorExam {

	public static void main(String[] args) {
		//다형성 기법
		Calculator ca = new MyCalculator();
		
		int value1 = ca.multiple(10, 2);
		int value2 = ca.plus(5, 10);
		int value3 = ca.exe(5, 10);
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);

	}

}
