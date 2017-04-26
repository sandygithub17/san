package guvi;

import java.util.Scanner;

public class Even_Odd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		if((num%2==0)||(num==0)) {
			System.out.println(num+" is a Even number");
		}
		else {
			System.out.println(num+" is a Odd number");
		}

	}

}
