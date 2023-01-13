package ch04;

import java.util.Scanner;

public class Ecommerce {

	public static void main(String[] args) {
		
		String name="";
		int price = 0;  // 가격
		int point = 0; //포인트
		int point_use = 0; //포인트 사용액
		int fee = 0; //배송료
		int pay = 0; //실제 결제 금액
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이      름 : ");
		name = sc.next();
		
		System.out.print("구 매 금 액 : ");
		price = sc.nextInt();
		
		System.out.print("보유 포인트 : ");
		point = sc.nextInt();
		
		sc.close();
		
		if (price < 20000) { //구매금액이 2만원 미만이면
			
			fee = 2500;  //배송료 2500원 부과
			
		}if (point >= 10000 ) { //포인트가 만점 이상이면
			
			point_use = point;
			pay = price + fee - point;
			
		}else {
			
			pay = price + fee;
			
		}
		
		System.out.println("이   름\t구매금액\t배 송 료\t포인트사용\t결제금액");
		System.out.println(name+"\t"+price+"\t"+fee+"\t"+point_use+"\t"+pay);
		
	

	}

}
