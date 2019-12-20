package work;

public class PlaneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Plane[] metalFly = new Plane[2];

		metalFly[0] = new Airplane("L747", 1000);
		metalFly[1] = new Cargoplane("C40", 1000);
		printInfo(metalFly);

		metalFly[0].flight(100);
		metalFly[1].flight(100);
		printInfo(metalFly);

		metalFly[0].refuel(200);
		metalFly[1].refuel(200);
		printInfo(metalFly);
	}

	public static void printInfo(Plane[] list) {
		// Ÿ��Ʋ ���
		System.out.println("\tPlane\t\tfuelSize");
		System.out.println("-------------------------------------");
		// Plane ��ü���� ������ ���(��� ��� ����)
		for (Plane data : list) {
			System.out.println("\t" + data.getPlaneName() + "\t\t" + data.getFuelSize());
		}
		System.out.println();
	}

}
