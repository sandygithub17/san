package guvi;

import java.util.Scanner;

public class PowerOfTheGivenInteger {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int num = ss.nextInt();
		int sum = 0;
		int product = 0;
		while(num  != 0) {
			sum = num%10;
			product+= (int) Math.pow(sum, sum-1);
			num/=10;
		}
		System.out.println(product);
		ss.close();
	}

}
