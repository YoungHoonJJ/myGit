package ch03;

import java.util.Scanner;

public class JumSoo {
	
	public static void main(String[] args){
		
		String name; //이름
		int java,db,html,jsp; // 자바 db html jsp
		
		int total; //총점
		double avg; //평균
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		name = sc.next();
		
		System.out.print("java : ");
		java = sc.nextInt();
		
		System.out.print("DB : ");
		db = sc.nextInt();
		
		System.out.print("HTML : ");
		html = sc.nextInt();
		
		System.out.print("jsp : ");
		jsp = sc.nextInt();
		
		sc.close();
		
		total = java+db+html+jsp;
		avg = total/4.0;
		
		
		System.out.println("출력 결과 : ");
		
		System.out.println("=======================================================");
		
		System.out.println("이름\t JAVA\t DB\t HTML\t JSP\t 총점\t 평균");
		
		System.out.println("_______________________________________________________");
		
		
		//System.out.println(name+"\t"+java+"\t"+db+"\t"+html+"\t"+jsp+"\t"+total+"\t"+avg);
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%.1f\n",name,java,db,html,jsp,total,avg);
		
		
		System.out.println("=======================================================");
		
		
		
		
		
		/*
		 * 입력 :

이름 : 홍길동

Java : 80

DB : 95

HTML : 100

JSP : 82

​

출력 결과:

=========================================

이름        Java      DB      HTML      JSP       총점       평균

---------------------------------------------------------------------

홍길동       80       95        100       82        000        00.0

=========================================
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
		
		
	}

}
