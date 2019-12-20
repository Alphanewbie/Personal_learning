package day11;

public class SaleTV extends TV {

	private int price;

	SaleTV() {
	}

	SaleTV(int price, String model, int size, int channel) {
		super(model, size, channel);
		this.price = price;
	}

	public void play() {
		System.out.printf("�Ǹ� TV ä�� %d���� ���θ� �÷��� �մϴ�.\n", getChannel());
	}

	public String toString() {
		return String.format("�ǸŻ�ǰ���� : �𵨸�(%s), ����(%,d��), ũ��(%d)", getModel(), this.price, getSize());
	}

	public void sale() {
		System.out.printf("%s ���� ��ǰ�� �Ǹ��մϴ�. %d �� ������ �ּ���\n", getModel(), price);
	}
}
