package guvi;

import java.util.Scanner;

public class Hunter132 {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int limit = ss.nextInt();
		for(int i = 0; i < limit; i++) {
			for(int j = i; j < limit; j++) {
				System.out.print("*");
			}
			System.out.print(" ");
			for(int j = i; j < limit; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		ss.close();
	}

}
