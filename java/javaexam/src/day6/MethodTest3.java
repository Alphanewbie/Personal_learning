package day6;

public class MethodTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main() �������");
		printMyname(1, '#');
		System.out.println("------------------");
		printMyname(3, '*');
		System.out.println("------------------");
		printMyname(2, '@');
		System.out.println("main() ���ೡ");
	}

	static void printMyname(int num, char deco) {
		for (int i = 1; i <= num; i++)
			System.out.println(deco + "me" + deco);
	}
}
