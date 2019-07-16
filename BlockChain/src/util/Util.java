package util;

import java.security.MessageDigest;

public class Util {

	//sha-256 연산 메소드 
	public static String getHash(String input)
	{ // 입력이 들어왔을때 그에 대한 해쉬값을 구해줌 
		StringBuffer result = new StringBuffer(); // 문자열 객체 
		try
		{
			MessageDigest md =MessageDigest.getInstance("SHA-256");
			md.update(input.getBytes()); // 입력값의 바이트 데이터를 가져와 준비를 함 
			byte bytes[] = md.digest(); //해쉬결과값을 disget()를 이용하여 받아온뒤
			
			for(int i=0;i<bytes.length;i++) // 문자열 형태로 화면에 출력 
			{
				result.append(Integer.toString((bytes[i] & 0xff)+0x100,16).substring(1)
						);
			}
			
			
		}
		catch (Exception e) // 예외 처리 
		{
			e.printStackTrace();
		}
		return result.toString();
		
	}
	
	
}
