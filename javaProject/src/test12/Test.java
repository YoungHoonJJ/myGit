package test12;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1이상의 숫자를 입력하세요");
		int num = sc.nextInt();
		
		int sum =0;
		if(num>0) { //num>=0 0을 포함하는것이 아닌 num이 0보다 커야 한다
			int i = 1;
			while(i<=num) {
				sum+=i+num; //sum+=i -> sum = sum+i 뜻으로 0+i는 합이 아니다
				break;
			}
			System.out.println("1부터"+num+"까지의 합은"+sum+"입니다");;
		}else {
			System.out.println("숫자가 1 이상이 아닙니다.");
		}
		
	}
}
	
	/*public void sum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1이상의 숫자를 입력하세요");
		int num = sc.nextInt();
		
		int sum =0;
		if(num>=0) {
			int i = 1;
			while(i<=num) {
				sum+=i;
			}
			System.out.println("1부터"+num+"까지의 합은"+sum+"입니다");;
		}else {
			System.out.println("숫자가 1 이상이 아닙니다.");
		}
	}
*/
	


