package ch05;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SortExample {

	public static void main(String[] args) {
		int num[] = {29,1,81,70,13,92,36};
		
		Arrays.sort(num); //오름차순 정렬 함수
		
		for(int i : num) {
			
			System.out.print(i +" ");
			
		}
		System.out.println();
		
		Integer rev[] = {2,91,81,70,13,92,36};
		Arrays.sort(rev, Collections.reverseOrder());
		
		for(int i : rev) {
			
			System.out.print(i+" ");
		}
	}

}
