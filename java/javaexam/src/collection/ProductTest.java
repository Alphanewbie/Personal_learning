package collection;

import java.util.HashSet;
import java.util.Iterator;

public class ProductTest {

	private static final boolean Product = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product[] prod = new Product[4];

		prod[0] = new Product("p100", "TV", "20000");
		prod[1] = new Product("p200", "Computer", "10000");
		prod[2] = new Product("p100", "MP3", "700");
		prod[3] = new Product("p300", "Audio", "1000");

		HashSet<String> set = new HashSet<String>();

		for (Product data : prod) {
			if(set.add(data.getProductID()))
				System.out.println("��ǰ�� ���������� ����Ǿ����ϴ�.");
			else
				System.out.println("������ ID �� ��ǰ�� �̹� ����Ǿ� �ֽ��ϴ�.");
		}

		System.out.printf("%-10s%-10s%-10s\n", "��ǰ", "ID", "��ǰ�� ����");
		System.out.printf("------------------------------------\n");

		
		Iterator<String>iterator=set.iterator();
		while(iterator.hasNext()){
			String data=iterator.next();
			for (Product dat : prod) {
				if(dat.getProductID().equals(data)) {
						System.out.println(dat.proInfo());
						break;
				}
			}
		}
		

	}

}
