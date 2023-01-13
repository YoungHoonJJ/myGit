package ja05;

public class MyThread_Im_Use {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new MyThread_Im(),"스레드1");
		Thread t2 = new Thread(new MyThread_Im(),"스레드2");
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
		// TODO Auto-generated method stub

	}

}
