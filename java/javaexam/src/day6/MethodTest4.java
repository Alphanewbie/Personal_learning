package day6;

public class MethodTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.out.println("main() �������");
		printMyname(3,'*');
		printMyname("��ũ",'$');
		System.out.println("main() ���ೡ");
	}

	static void printMyname(int num, char deco) {
		for (int i = 1; i <= num; i++)
			System.out.println(deco + "me" + deco);
	}

	static void printMyname(String name, char deco) {
		System.out.println(deco + name + deco);
	}

}
