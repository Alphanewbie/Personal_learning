package day9;

public class GuGuDanExpr extends Multiplication{

	GuGuDanExpr () {
		
	}
	GuGuDanExpr (int dan){
		super(dan);
	}
	GuGuDanExpr (int dan,int number){
		super(dan,number);
	}
	public static void printAll(){
		
		//1�ܺ��� 9�ܱ��� ���� ���
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.printf("%3d * %3d = %3d",i,j,i*j);
			}
			System.out.println();
		}
	}


}
