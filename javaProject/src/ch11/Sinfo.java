package ch11;

public class Sinfo implements Student {

	@Override
	public void adress(String name,String home,String mail){
		
		System.out.println(name+"\t"+home+"\t"+mail);
	}

	@Override
	public void point(String name,int kor,int eng,int mat) {
		
		int tot = kor+eng+mat;
		double avg = tot/3.0;
		System.out.println(kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"
		+String.format("%.2f", avg));
		
		
	}

}
