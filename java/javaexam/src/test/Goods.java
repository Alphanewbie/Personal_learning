package test;

public class Goods {
	String prodId; // ��ǰ ���̵�
	String prodName; // ��ǰ �̸�
	int price; // ��ǰ ����
	char asYn; // AS ���� ����

	// ������ �� ���� �����Ͻÿ�.

	Goods(String prodId, String prodName, int price) {
		this(prodId, prodName, price, 'Y');
	}

	Goods(String prodId, String prodName, int price, char asYn) {
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
		this.asYn = asYn;
	}

	// getGoodsInfo() �޼��带 �����Ͻÿ�.
	public String getGoodsInfo() {
		if (asYn == 'Y')
			return String.format("��ǰID : %s, ��ǰ�� : %s, ���� : %,d��, AS���ɿ��� : ����", prodId, prodName, price, asYn);
		else
			return String.format("��ǰID : %s, ��ǰ�� : %s, ���� : %,d��, AS���ɿ��� : �Ұ�", prodId, prodName, price, asYn);
	}

	public String getProdId() {
		return prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public char getAsYn() {
		return asYn;
	}

	public void setAsYn(char asYn) {
		this.asYn = asYn;
	}
}
