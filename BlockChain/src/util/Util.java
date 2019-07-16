package util;

import java.security.MessageDigest;

public class Util {

	//sha-256 ���� �޼ҵ� 
	public static String getHash(String input)
	{ // �Է��� �������� �׿� ���� �ؽ����� ������ 
		StringBuffer result = new StringBuffer(); // ���ڿ� ��ü 
		try
		{
			MessageDigest md =MessageDigest.getInstance("SHA-256");
			md.update(input.getBytes()); // �Է°��� ����Ʈ �����͸� ������ �غ� �� 
			byte bytes[] = md.digest(); //�ؽ�������� disget()�� �̿��Ͽ� �޾ƿµ�
			
			for(int i=0;i<bytes.length;i++) // ���ڿ� ���·� ȭ�鿡 ��� 
			{
				result.append(Integer.toString((bytes[i] & 0xff)+0x100,16).substring(1)
						);
			}
			
			
		}
		catch (Exception e) // ���� ó�� 
		{
			e.printStackTrace();
		}
		return result.toString();
		
	}
	
	
}
