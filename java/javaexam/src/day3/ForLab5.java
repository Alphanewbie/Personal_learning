package day3;

public class ForLab5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int evenNum = 0;
		int oddNum = 0;

		for (int i = 0; i < 100; i++) {
			if ((i + 1) % 2 == 0)
				evenNum += i + 1;
			else
				oddNum += i + 1;
		}
		System.out.println("1���� 100������ ���ڵ� �߿��� ");
		System.out.println("¦���� ���� " + evenNum + "�̰�");
		System.out.println("Ȧ���� ���� " + oddNum + "�̴�.");
	}

}
