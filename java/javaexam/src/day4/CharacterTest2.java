package day4;

public class CharacterTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char v1 = '��';
		char v2 = '\uAC00';
		char v3 = 44032;

		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);	//�� �� ����

		System.out.println((int) v1); // 44032 �ѱ� ���� �ڵ� ��. �ƽ�Ű �ڵ尡 �ƴϴ�.
		System.out.println((int) v2);

		System.out.println((double) v1);
		System.out.println((double) v2);

	}

}
