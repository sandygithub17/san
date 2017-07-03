package guvi;

import java.util.Scanner;

public class Kindergarten {

	public static void main(String[] args) {
		
		Scanner ss = new Scanner(System.in);
		int children = ss.nextInt();
		ss.close();
		int count = 0;
		int uniqPair = 1;
		for(int i = 0; i < 2*children; i++) {
			int pairs = 2*children - i;
			if(children != pairs) {
				System.out.print(" "+uniqPair++);
				count++;
			}
		}
		System.out.println();
		System.out.println("number of pairs "+count);
	}

}
