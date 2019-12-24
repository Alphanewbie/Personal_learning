package day15;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class URLTest1 {
	public static void main(String[] args) throws Exception {
		URL url = new URL("https://movie.naver.com/");
		InputStream is = url.openStream();	/// ����Ʈ ��Ʈ�� ��ü�� ������
		BufferedReader br = new BufferedReader(new InputStreamReader(is,"UTF-8"));
		// �Է� ���� ���� ���� ��Ʈ������ ��ȯ, �ڿ� ���Ŵ� � ĳ���� ������ �а� �� ���� ����
		String line = null;
		while (true) {
			line = br.readLine();
			if (line == null)
				break;
			System.out.println(line);
		}
	}
}
