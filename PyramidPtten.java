package guvi;

import java.util.Scanner;

public class PyramidPtten {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int n = ss.nextInt();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n-i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k <= i; k++) {
				System.out.print("s ");
			}
			System.out.println();
		}
		ss.close();
	}

}
