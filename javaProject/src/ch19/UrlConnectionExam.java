package ch19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

//프로그램 <==== 원격컴퓨터의 리소스 InputStream
//프로그램 ====> 원격컴퓨터의 리소스 OutputStream

public class UrlConnectionExam {

	public static void main(String[] args) {
		URL url = null;
		
		try {
			url = new URL("http://google.com");
			//url 접속시도 --> 성공하면 접속정보를 conn에 저장
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			if(conn!= null) {
				//서버에서 일정 시간 응답이 없으면 연결을 종료 시킴
				conn.setConnectTimeout(3000);//타임아웃 시간 설정
				StringBuilder sb = new StringBuilder();
				//정상적으로 처리된 경우
				//http status code(상태코드)
				if(conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
					//스트림을 사용해서 html 소스코드를 읽어옴
					//버퍼사용
					BufferedReader br = new BufferedReader
							(new InputStreamReader(conn.getInputStream(),"utf-8"));
					while (true) {
						String line = br.readLine();//한 라인을 읽음
						if(line == null) break; //더이상 내용이 없으면 종료
						sb.append(line+"\r\n"); //줄바꿈 추가
					}
					br.close();//버퍼 닫기
				}
				conn.disconnect();
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
