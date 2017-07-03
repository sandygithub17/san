package guvi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LeastnumberDelete {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int n = ss.nextInt();//enter the size of the number
		ArrayList<Integer> number = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			number.add(ss.nextInt());
		}
		Collections.sort(number);
		System.out.println(number);
		int k = ss.nextInt();//enter the deleting number of digits
		ss.close();
		for(int j = 0; j < n-k; j++) {
			System.out.print(number.get(j));
		}
	}
}
