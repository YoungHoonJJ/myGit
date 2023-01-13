package ch11;

public interface Calculator {
	public int plus(int i,int j);
	public int multiple(int i, int j);
	default int exe(int i, int j) { //jdk1.8부터 가능
		return i+ j;
	}

}
