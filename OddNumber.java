package programs1;

import java.util.Scanner;

public class OddNumber {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the starting number");
		int upperlimit = ss.nextInt();
		System.out.println("Enter the ending number");
		int lowerlimit = ss.nextInt();
		ss.close();
		for(int i=upperlimit;i<=lowerlimit;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}

	}

}
