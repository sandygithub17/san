package guvi;

import java.util.Scanner;

public class LargeNumber {

	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the Three number:");
		int num=ss.nextInt();
		int num1=ss.nextInt();
		int num2=ss.nextInt();
		if(num>num1) {
			if(num>num2) {
				System.out.println(num);
			}
			else {
				System.out.println(num2);
			}
		}
		else {
			if(num1>num2) {
			System.out.println(num1);
		}
			else {
					System.out.println(num2);
			}
	  }
	}

}
