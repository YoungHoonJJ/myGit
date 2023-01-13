package ch03;

public class InCrease {
	
	public static void main(String[] args)
	{
		int i = 5;
		int j = 0;
		j = i++; // i의 값을 1씩 증가 시키겠다.(나중계산)
		
		System.out.println(i+","+j); //6,5
		
		i=5;
		j=++i; // i값을 1증가시킴(먼저계산)
		
		System.out.println(i+","+j);
	}

}
