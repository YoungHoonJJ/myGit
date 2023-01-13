package ja05;

public class MyThread_Ex extends Thread  {
	
	String s;

	public MyThread_Ex(String s) { 
		this.s = s;
	}

	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(s + "==>" + i);
		}
		
	}
	
}
