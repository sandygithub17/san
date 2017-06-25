package guvi;

import java.util.Scanner;

public class FourPointSquare {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int sum1 = 0;
		int sum2 = 0;
		int[][] num = new int[4][2];
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 2; j++) {
				num[i][j] = ss.nextInt(); 
			}
		}
		sum1 = num[0][0]+num[1][0]+num[2][0]+num[3][0];
		sum2 = num[0][1]+num[1][1]+num[2][1]+num[3][1];
		if(sum1 == sum2) {
			System.out.println("Square");
		}
		else {
			System.out.println("Not Square");
		}
		
	}

}
