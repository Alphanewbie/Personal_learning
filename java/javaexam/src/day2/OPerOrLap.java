package day2;

public class OPerOrLap {

	public static void main(String[] args) {
		int grade = (int) (Math.random() * 6) + 1;

		if (1 <= grade && grade <= 3)
			System.out.print(grade + "�г��� ���г��Դϴ�.");
		else if (4 <= grade && grade <= 6)
			System.out.print(grade + "�г��� ���г��Դϴ�.");
	}
}
