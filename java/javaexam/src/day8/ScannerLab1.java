package day8;

import java.util.Scanner;

public class ScannerLab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		String cal = in.next();
		in.close();
		int result;
		//���⼭ if, else�� �Ἥ Ż�� �ϴ� ����� ����.
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
			System.out.print("+,-,/,* �� �Է��ϼ�");
			return;
		}
		System.out.printf("%d �� %d %s�� �������� %d�Դϴ�", num1, num2, cal, result);
	}
}
