package day5;

public class TwoArrayLab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = new int[4][4];

		int a = 8;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = a += 2;
			}
		}

		System.out.println("1�� 1���� ������ : " + arr[0][0]);
		System.out.println("3�� 4���� ������ : " + arr[2][3]);
		System.out.println("���� ���� : " + arr.length);
		System.out.println("���� ���� : " + arr[0].length);
		System.out.print("3���� �����͵� : ");
		for (int j = 0; j < arr[2].length; j++) {
			System.out.print(arr[2][j] + " ");
		}
		System.out.println();
		System.out.print("2���� �����͵� : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i][1] + " ");
		}
		System.out.println();
		System.out.print("���� �밢�� �����͵� : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i][i] + " ");
		}
		System.out.println();
		System.out.print("������ �밢�� �����͵� : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i][arr.length - i - 1] + " ");
		}
	}

}
