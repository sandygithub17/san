package guvi;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class FirstMaxSecondMin {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the number of elements in array");
		int n = ss.nextInt();
		int[] numbers = new int[n];
		System.out.println("Enter array elements");
		for(int i = 0; i < n; i++) {
			numbers[i] = ss.nextInt();
		}
		int len = 0;
		if(n%2 == 0) {
			len = n/2;
		}
		else {
			len = (n/2)+1;
		}
		for(int j = 0; j < len; j++) {
			if(j == 0) {
				System.out.print(numbers[(numbers.length-1)]+","+numbers[j]);
			}
			else {
				if((n%2 == 1) && (j == (n/2))) {
					System.out.print(","+numbers[(numbers.length-1) - j]);
				}
				else {
					System.out.print(","+numbers[(numbers.length-1) - j]+","+numbers[j]);
				}
			}
		}
		ss.close();
	}

}
