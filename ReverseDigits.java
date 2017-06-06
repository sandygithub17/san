package santhosh;

import java.util.Scanner;

public class ReverseDigits {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = ss.nextInt();
		int result=0;
		while(num>0) {
			result=num%10;
			num/=10;
			System.out.print(result);
		}
		ss.close();
	}

}
