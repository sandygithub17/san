package guvi;

import java.util.Scanner;

public class HourGlasses {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter row and column");
		int n = ip.nextInt();
		int[][] number = new int[n][n];
		if(n%3 == 0) {
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					number[i][j] = ip.nextInt();
				}
			}
			int sum;
			int max = -9999;
			for(int a = 0; a < n-2; a++) {
				for(int b = 0; b < n-2; b++) {
					sum = number[a][b]+number[a][b+1]+number[a][b+2]+number[a+1][b+1]+number[a+2][b]+number[a+2][b+1]+number[a+2][b+2];
					if(sum > max) {
						max = sum;
					}
				}
			}
			System.out.println(max);
		}
		else {
			System.out.println("Given the input multiples of three");
		}
				ip.close();
	}

}
