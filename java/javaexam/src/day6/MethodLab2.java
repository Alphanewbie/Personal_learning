package day6;

public class MethodLab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		int num2;
		int cnt=0;
		while(cnt<5) {
			num1 = (int)(Math.random()*30) +1;
			num2 = (int)(Math.random()*30) +1;
			System.out.printf("%d �� %d �� ���� %d �Դϴ�.\n",num1,num2,calculate(num1,num2));
			cnt ++;
		}
		
	}

	static int calculate(int num1,int num2) {
		if(num1>num2) 
			return num1-num2;
		else if(num2>num1)
			return num2-num1;
		return 0;
	}

}
