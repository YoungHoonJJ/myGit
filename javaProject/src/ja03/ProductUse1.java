package ja03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductUse1 {

	public static void main(String[] args) {
		
		
		System.out.println("제품정보를 입력하세요.");
		
		String exit = "";
		List<Product> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		
		
		
		while (true) {
			Product pr = new Product();
			pr.print();
			
			list.add(pr);
			
			System.out.print("계속하려면 아무키나 누르시오.(exit 입력시 종료)");
			exit = sc.next();
			if(exit.equals("exit")) {
				break;
			}
			
		}
		
		sc.close();
		

		
		System.out.println("=======================================================");
		System.out.println("제품번호\t제품이름\t제조회사\t단가\t수량\t가격");
		System.out.println("______________________________________________________");
		
		for(int i=0; i<list.size(); i++) {
			
			Product p = list.get(i);
			System.out.println(p.getSno()+"\t"+p.getName()+"\t"+p.getCompany()
			+"\t"+p.getMoney()+"\t"+p.getCount()+"\t"+p.getPrice());
			//System.out.println(list.size());
		}
		
		
		System.out.println("=======================================================");
		
		// TODO Auto-generated method stub

	}

}
