package ch05;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {

		int list[] = {10,20,30,40,50};
		
		
		//배열복사 방법 2가지
		//1)얕은 복사 : 배열의 주소값을 공유해서 복사
		
		int[] numbers = list;
		
		for(int i=0; i<list.length; i++) {
			
			System.out.print("\t"+numbers[i]);
		}
		
		int[] list_copy = Arrays.copyOf(list, list.length);
		
		for(int value : list_copy) {
			
			System.out.println(value);
		}
	}

}
