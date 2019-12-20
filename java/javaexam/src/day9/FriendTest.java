package day9;

class Person {

	private String name;

	Person(String name) {
		this.name = name;
	}

	public String getInfo() {
		return name;
	}

}

class Friend extends Person {

	private String phoneNum;
	private String email;

	Friend(String name, String phoneNum, String email) {
		super(name);
		this.phoneNum = phoneNum;
		this.email = email;
	}

	public String getInfo() {
		return (super.getInfo() + "\t" + phoneNum + "\t" + email);
	}
}

public class FriendTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Friend[] fri = new Friend[5];

		fri[0] = new Friend("�ٸ���", "010-1234-5678", "Alice@fairytale.com");
		fri[1] = new Friend("�������", "010-5678-1234", "Madhatter@fairytale.com");
		fri[2] = new Friend("ä�� Ĺ", "010-4321-8765", "Cheshire@fairytale.com");
		fri[3] = new Friend("�� �䳢", "010-8765-4321", "WhiteRabbit@fairytale.com");
		fri[4] = new Friend("��Ʈ����", "010-6543-6432", "HeartQueen@fairytale.com");
		System.out.printf("�̸� \t ��ȭ��ȣ \t\t �����ּ�\n");
		System.out.printf("-------------------------------\n");
		for (int i = 0; i < fri.length; i++) {
			System.out.println(fri[i].getInfo());
		}
	}

}
