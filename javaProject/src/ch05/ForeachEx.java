package ch05;

public class ForeachEx {
	
	enum Week{월,화,수,목,금,토,일}

	public static void main(String[] args) {
		
		int[] n = {1,2,3,4,5};
		String name[] = {"사과","배","바나나","체리","딸기","포도"};
		int sum = 0;
		
		for(int k : n) {
			
			System.out.print(k+" ");
			sum += k;
		}
		System.out.println("합은 : "+sum);
		// TODO Auto-generated method stub
		for(String s : name) {
			
			System.out.print(s+" ");
		}
		System.out.println();
		
		for(Week day : Week.values()) {
			
			System.out.println(day +"요일");
			
		}
	}

}
