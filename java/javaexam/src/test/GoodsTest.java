package test;

public class GoodsTest {
	public static void main(String[] args) {
		// "PRD-0001", "��ũ��ǻ��", 10000, 'N' ���� ��ü ����
		// "PRD-0002", "�ν���ǻ��", 20000 ���� ��ü ����
		// ������ ��ü ���� getGoodsInfo()�� ȣ���ϰ� ���ϰ���� ����մϴ�.

		Goods no1 = new Goods("PRD-0001", "��ũ��ǻ��", 10000, 'N');
		Goods no2 = new Goods("PRD-0002", "�ν���ǻ��", 20000);

		System.out.println(no1.getGoodsInfo());
		System.out.println(no2.getGoodsInfo());
	}
}
