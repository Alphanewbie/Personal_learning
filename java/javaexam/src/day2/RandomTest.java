package day2;

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("����1");
		System.out.println("����2");
		if ((int) (Math.random() * 10) + 1 > 5) // 0.0<=n<1.00
			System.out.println("����3");
		else {
			System.out.println("����4");
			System.out.println("����5");
		}
		System.out.println("����6");
	}
}
