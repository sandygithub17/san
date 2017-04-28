package guvi;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the Multiplication number");
		int num=ss.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(i+"x"+num+"="+(i*num));
		}

	}

}
