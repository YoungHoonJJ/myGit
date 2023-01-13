package ja10;

import java.io.RandomAccessFile;

/*
문제2] RandomFile2.java

RandomFile를 응용해서 아래처럼 처리해보세요.

rand2.txt 파일을 만들어

"UserID : kim"라는 문자열을 저장한 후 kim을 park으로 바꿔보세요.
 * 
 */

public class RandomFile2 {

	public static void main(String[] args) {
		
		try {
			RandomAccessFile ra = new RandomAccessFile("c:\\test\\rand2.txt", "rw");
			System.out.println(ra.getFilePointer());
			
			ra.seek(9); // UserID : kim 9번째
			
			ra.write("kim".getBytes());
			
			
			ra.close();
			
			System.out.println("파일이 저장되었습니다.");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
