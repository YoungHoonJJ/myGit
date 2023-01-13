package ja05;

public class BankPlayer extends Thread {
	
	int type;
	
	MyBank myBank;
	public BankPlayer(int type, MyBank myBank) {
		this.type = type;
		this.myBank = myBank;
	}
	@Override
	public void run() {
		switch (type) {
		case 1: myBank.playBankA(); break;
		case 2: myBank.playBankB();	break;
		case 3: myBank.playBankC(); break;
		}
	}
	
	

}

