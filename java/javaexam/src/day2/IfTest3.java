package day2;

public class IfTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = (int) (Math.random() * 12) + 1;
		
		if(month==12||month==1||month==2)
			System.out.println(month+":�ܿ�");
		else if (3<=month&&month<6)
			System.out.println(month+":��");
		else if (6<=month&&month<9)
			System.out.println(month+":����");
		else
			System.out.println(month+":����");
	}
}
