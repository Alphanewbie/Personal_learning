package day11;

public class TVTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	     SaleTV, RentalTV Ŭ������ ��ü�� ���� �����Ѵ�.
//	     SaleTV ��ü�� ä���� �� �� ���δ�.
//	     RentalTV ��ü�� ä���� �� �� ������.
//	     �� ��ü�� ���Ͽ� printAllTV()�� ȣ���Ѵ�.
//	     Rentable Ÿ���� ��ü�� RentalTV ��ü�� printRentalTV() �� ȣ���Ѵ�.

		SaleTV sale = new SaleTV(300000,"SALETV-1",40,1);
		RentalTV rental = new RentalTV(100000,"RENTALTV-10",42,1);
		
		for(int i=0;i<2;i++)
			sale.channelUp();
		for(int i=0;i<3;i++)
			rental.channelDown();
		
		printAllTV(sale);
		printAllTV(rental);
		
		printRentalTV(rental);
	}
	
	static void printAllTV(TV tv) {
	     // �ƱԸ�Ʈ�� ���޵� ��ü�� toString() �� ȣ���Ͽ� �� ��ǰ�� ������ ����Ѵ�.
	     // �ƱԸ�Ʈ�� ���޵� ��ü�� play() �� ȣ���Ѵ�.    
	     // tv ������ ���޵� ��ü�� SaleTV Ÿ���̸� sale() �޼��带 ȣ���Ѵ�.  
		
		System.out.println(tv.toString());

		if(tv instanceof SaleTV)
			((SaleTV) tv).play();
		if(tv instanceof RentalTV)
			((RentalTV) tv).play();
		if(tv instanceof SaleTV)
			((SaleTV) tv).sale();
	}
	static void printRentalTV(Rentable tv) {
	     // �ƱԸ�Ʈ�� ���޵� Rentable ��ü�� rent() �޼��带 ȣ���Ѵ�.
		tv.rent();
	}


}
