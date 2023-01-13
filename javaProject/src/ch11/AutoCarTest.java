package ch11;

public class AutoCarTest {

	public static void main(String[] args) {
		OperateCar op = new AutoCar();
		
		op.start();
		op.setSpeed(30);
		op.turn(15);
		op.stop();

	}

}
