package day10;

import java.util.Scanner;

public class ScannerLab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int result;
		int num1;
		int num2;
		String cal;

		for (int i = 0; i < 3; i++) {

			result = 0;
			System.out.print("ù ��° ���ڸ� �Է��ϼ��� : ");
			num1 = in.nextInt();
			System.out.print("�� ��° ���ڸ� �Է��ϼ��� : ");
			num2 = in.nextInt();
			System.out.print("������(+, -, *, /)�� �Է��ϼ��� : ");
			cal = in.next();

			// ���⼭ if, else�� �Ἥ Ż�� �ϴ� ����� ����.
			switch (cal) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "/":
				result = num1 / num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			default:
				System.out.print("+,-,/,* �� �Է��ϼ�\n\n");
				continue;
			}

			System.out.printf("%d �� %d %s�� �������� %d�Դϴ�\n\n", num1, num2, cal, result);
		}
		in.close();
	}
}
