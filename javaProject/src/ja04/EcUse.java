package ja04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EcUse {

	

	public static void main(String[] args) {
		
		Map<String, Object>ma = new HashMap<>();
		List<EC> list = new ArrayList<>();
		
		list.add(new EC(1001, "2021-07-14", "버드와이저", "삼성", "34529573910", 55900));
		list.add(new EC(2354, "2022-02-08", "꼬북칩", "롯데", "584930293884", 23600));
		list.add(new EC(3471, "2023-01-04", "노트북", "현대", "873493847364", 2600000));
		
		ma.put("list", list);
		print(ma);
		

	}

	private static void print(Map<String, Object> ma) {
		
		ArrayList<EC> list1 = (ArrayList<EC>)ma.get("list");
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("주문번호\t주문일자\t\t주문상품\t\t카드명\t\t카드번호\t\t결제금액");
		System.out.println("_________________________________________________________________________________");
		
		/*
		for(int i=0; i<list1.size(); i++) {
			
			EC e = list1.get(i);
			System.out.println(e.getNo()+"\t"+e.getOrderDate()
			+"\t"+e.getProduct()+"\t\t"+e.getCardName()+"\t"+e.getCardNo()+"\t"+e.getPay());
			
		}
		*/
		for(EC e:list1) {
			System.out.println(e.getNo()+"\t"+e.getOrderDate()
			+"\t"+e.getProduct()+"\t\t"+e.getCardName()+"\t"+e.getCardNo()+"\t"+e.getPay());
		}
		System.out.println("---------------------------------------------------------------------------------");
		
		
	}

}
