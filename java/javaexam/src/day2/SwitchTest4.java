package day2;

public class SwitchTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = (int) (Math.random() * 101);

		switch (score / 10) {
		case 10:
		case 9:
			System.out.println(score + ": A���");
			break;
		case 8:
			System.out.println(score + ": B���");
			break;
		case 7:
			System.out.println(score + ": c���");
			break;
		case 6:
			System.out.println(score + ": D���");
			break;
		default:
			System.out.println(score + ": F���");

		}
		System.out.println("��������");

	}
}
