package day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapLab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> map = new HashMap<String, Integer>(5);
		Scanner in = new Scanner(System.in);
		String str = null;
		int num = 0;

		while (map.size() < 5) {
			System.out.print("�����̸��� �Է��ϼ��� : ");
			str = in.next();
			System.out.print("�α� ���� �Է��ϼ��� : ");
			num = in.nextInt();

			if (map.get(str) == null) {
				map.put(str, num);
				System.out.println("����Ǿ����ϴ�.");
			} else
				System.out.println("����� " + str + "�� �̹� ����Ǿ����ϴ�.");
		}
		System.out.println("5���� ��� �ԷµǾ����ϴ�.");
		System.out.print("�Էµ� ������ : ");

		Iterator<String> iter = map.keySet().iterator();

		boolean falg = iter.hasNext();
		while (falg) {
			String key = iter.next();
			System.out.print(key + "(" + map.get(key) + ")");
			if (falg = iter.hasNext())
				System.out.print(",");
		}
	}

}
