package ch14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListMember {

	public static void main(String[] args) {
		
		//ArrayList<클랙스객체> -<Object>대신 만들어 놓은 Member객체를 제너릭하면 
		//Member에서 쓰이는 모든 자료형을 처리할 준비 가능해짐
		List<Member> list = new ArrayList<>();
		
		Member m1 = new Member();
		
		m1.setName("전영훈");
		m1.setUserid("honjin3");
		m1.setPasswd("1111");
		m1.setTel("01085798444");
		m1.setEmail("jjj@naver.com");
		
		
		//객체자료를 ArrayList에 담는 방법
		list.add(m1); //ArrayList에 Member 객체를 1개 추가
		
		System.out.println(list.size());
		
		Member m2 = new Member("ohh", "2222", "오은정", "1111", "aaa@naver.com");
		list.add(m2);
		System.out.println(list.size());
		
		list.add(new Member("kkk", "1111", "전영진", "3333", "ㅋㅋㅋ@naver.com"));
		System.out.println(list.size());
		
		System.out.println("이름\t아이디\t비번\t전화\t이메일");
		for(int i=0; i<list.size(); i++) {
			Member m=list.get(i); //여기서 m은 ArrayList의 각 데이터를 가리킬 임시 참조변수 활용
			System.out.println(m);
			System.out.println(m.getName()+"\t"+m.getUserid()+"\t"+m.getPasswd()+"\t"+m.getTel()+"\t"+m.getEmail());
		}
	}

}
