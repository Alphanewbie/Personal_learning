package day8;

class Parent {	//java.lang.Object

	int x=1, y=2;
	public String toString() {
		return "Parent Ŭ������ ��ü";
	}
	
}

class Child extends Parent {
	int x =10;
	
	void printInfo() {
		int x =100;
		System.out.println(x);			//100  �̹� �ż��� ���� x�� ���� �Ȱ� ������ �װ� ��µȴ�
		System.out.println(this.x);		//10 �ڽ��� x, Ŭ������ �ν��Ͻ� ����
		System.out.println(super.x);	//1 �θ��� x
		System.out.println(y);			// 2 ����� y�ż��� ������ �Լ� ������ ���
		System.out.println(this.y);		// 2 �θ�� y Ŭ������ �ν��Ͻ� �Լ��� ��� �θ�� ���� ��� ����
		System.out.println(super.y);	// 2 �θ�� y
	}
	
	public String toString() {
		return "Child Ŭ������ ��ü";
	}
	
}

public class ParentChildTEst {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p =new Parent();
		System.out.println(p.toString());
		System.out.println(p);
		System.out.println("���1"+p);
		// �� �ڵ������� ������ �ּ�, �� Ǯ���Ѵ�.
		// ��ü�� ���� ������ �ϳ��� ���ڿ��� ����ϴ� ��
		Card c =new Card();
		System.out.println(c.toString());
		System.out.println("���2"+c.toString());
		java.util.Date d = new java.util.Date();
		System.out.println(d.toString());
		Child e =new Child();
		System.out.println("���3"+e);
		e.printInfo();
//		System.out.println(e.super,y);
//		�䷱�� �ȵ�, ���� Ŭ���� �ȿ����� �ȴ�.
	}

}
