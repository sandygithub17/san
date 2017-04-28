package guvi;

import java.util.Scanner;

public class PowerCal {
	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the base number");
		double a=ss.nextDouble();
		System.out.println("Enter the exponent number");
		double b=ss.nextDouble();
		System.out.println("Power of number"+Math.pow(a, b));

	}

}
