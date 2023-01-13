package ja09;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderWhile {
	public static void main(String[] args) {
		
		int answer = 0;
		
		try {System.out.print("한글자를 입력하세요 : ");
			InputStreamReader isr = new InputStreamReader(System.in);
			answer = isr.read();		
			while(answer!=13) {
				System.out.println((char)answer);
				System.out.println("code : " + answer);
				answer = isr.read();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
