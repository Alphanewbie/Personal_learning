package day10;

public class PolyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printObjectInfo(new Object());
		printObjectInfo(new String("rksksek"));
		printObjectInfo("ABC");
		printObjectInfo(new java.util.Date());
		printObjectInfo(new java.io.File("c:\\temp"));
		printObjectInfo(new int[10]);
		printObjectInfo(new double[5]);
		printObjectInfo(new day7.Member());
		printObjectInfo(new Integer(100));
		printObjectInfo(100);		//java 5 AutoBoxing ����
	}

	static void printObjectInfo(Object o) {
		if (o instanceof String) {
			System.out.println("���ڿ� ��ü ���޵�" + o.getClass().getName() + ((String)o).length());
		}
		System.out.println("���޵� ��ü�� Ŭ���� �� :" + o.getClass().getName());
	}

}
