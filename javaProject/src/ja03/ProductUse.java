package ja03;

import java.util.ArrayList;
import java.util.List;

public class ProductUse {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		
		System.out.println("2건의 제품정보를 입력하세요.");
		
		Product pr = new Product();
		pr.print();
		
		Product pr1 = new Product();
		pr1.print();
		
		list.add(pr);
		list.add(pr1);
		
		System.out.println("제품번호\t제품이름\t제조회사\t단가\t수량\t가격(부가가치세포함)");
		
		for(int i=0; i<list.size(); i++) {
			
			Product p = list.get(i);
			System.out.println(p.getSno()+"\t"+p.getName()+"\t"+p.getCompany()
			+"\t"+p.getMoney()+"\t"+p.getCount()+"\t"+p.getPrice());
			//System.out.println(list.size());
		}
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
