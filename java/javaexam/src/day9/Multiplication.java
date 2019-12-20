package day9;

public class Multiplication {
	private int dan;
	private int number;

	Multiplication() {
	}

	Multiplication(int dan) {
		this.dan = dan;
	}

	Multiplication(int dan, int number) {
		this.dan = dan;
		this.number = number;
	}

	public void printPart() {
		//num 0�϶� dan�� ��ü ������ ���
		if (number == 0) {
			for (int n = 1; n <= 9; n++)
				System.out.print("\t" + dan + "*" + n + "=" + dan * n);
			System.out.println();
		} else {
			//�ƴϸ� �׳� dan�̶� nu ���
			System.out.println(dan * number);
		}
	}
}
