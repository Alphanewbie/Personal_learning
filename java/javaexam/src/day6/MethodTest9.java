package day6;

public class MethodTest9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = MethodLab3.getRandom(3, 8);
		int p[] = new int[size];
		for (int i = 0; i < p.length; i++) {
			p[i] = MethodLab3.getRandom(20);
		}
		for (int data : p)
			System.out.print(data + " \t");
		System.out.println();
		boolean flag[] = isEven(p);
		for (boolean data : flag)
			System.out.print(data + " \t");
		System.out.println();
	}

//	���޵� �迭�� ��Ұ����� ���� üũ�Ͽ�
//	¦���� true Ȧ���� false�� �����ϴ� boolean Ÿ�� �躴�� �����Ѵ�.
//	���޵� �迭�� ũ��� ������ ũ���� boolean Ÿ�� �迭�� �����ؼ� ����
	static boolean[] isEven(int[] p) {
		boolean[] result = new boolean[p.length];
		int i = 0;
		for (int data : p) {
			if (data % 2 == 0)
				result[i++] = true;
			else
				result[i++] = false;
		}
		return result;
	}

}
