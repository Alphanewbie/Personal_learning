package day5;

public class TwoArrayLab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[][] arr = { { 'B', 'C', 'A', 'A' }, { 'C', 'C', 'B', 'B' }, { 'D', 'A', 'A', 'D' } };

		int[] count = new int[4];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				switch (arr[i][j]) {
				case 'A':
					count[0]++;
					break;
				case 'B':
					count[1]++;
					break;
				case 'C':
					count[2]++;
					break;
				case 'D':
					count[3]++;
					break;
				}
			}
		}

		System.out.println("A��" + count[0] + "�� �Դϴ�.");
		System.out.println("B��" + count[1] + "�� �Դϴ�.");
		System.out.println("C��" + count[2] + "�� �Դϴ�.");
		System.out.println("D��" + count[3] + "�� �Դϴ�.");

	}

}
