package day7;

class StudentNew {
	String name;
	int age;
	String subject;
	StudentNew(String p1,int age) {
		name = p1;
		this.age =age;
		subject = "�ڹ�";
	}
	StudentNew(String p1,int age,String p3) {
		name = p1;
		this.age =age;
		subject = p3;
	}
	void printStudentInfo() {
		System.out.println(name+"�л��� ���̰� "+age+"�Դϴ�.");
	}
	void study() {
		System.out.println(name+"�л��� "+subject+"������ �н��մϴ�.");
	}
	void study(int hour) {
		System.out.println(name+"�л��� "+subject+"������ �н��մϴ�.");
	}
}
public class StudentTest2 {
	public static void main(String[] args) {
		StudentNew st1 = new StudentNew("�ڵ���", 10, "�Ͱ�");
		System.out.println(st1);
		System.out.println(st1.age);
		st1.study(2);
		StudentNew st2 = new StudentNew("�Ѹ�", 100, "scalar");
		System.out.println(st2.age);
		st2.study(2);
		StudentNew st3 = new StudentNew("�ڵ���", 10);
		System.out.println(st3);
		System.out.println(st3.age);
		st3.study(2);
		
	}
}
