package logicBulding;

public class Lp3 {
	public static void main(String[] args) {
		
		userMethod(1234);
	

	}
	public static void userMethod( int input1 ) {
		int sum = 0;
		int num1 = 0;
		int sum1 = 0;
			int temp=input1;
			sum = temp%10;
			while(temp > 0) {
				num1 = temp%10;
				sum1+= Math.pow(num1, sum);
				temp/=10;
			}
	
		System.out.println(sum1);
	}
}
