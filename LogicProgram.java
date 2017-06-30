package logicBulding;

public class LogicProgram {
	
	public static void main(String[] args) {
		int input1 = 1234;
		LogicProgram lp = new LogicProgram();
		lp.userMethod(input1);
	

	}
	public static void userMethod( int input1 ) {
		int sum = 0;
		while(input1 > 0) {
			int temp=input1;
			while(temp > 0) {
				sum+= temp%10;
				temp/=10;
		}
			input1/=10;
		}
	
		System.out.println(sum);
	}
}
