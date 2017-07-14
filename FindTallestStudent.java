package guvi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FindTallestStudent {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		Scanner ss = new Scanner(System.in);
		for(int i = 0; i < 50; i++) {
			al.add(ss.nextInt());//Enter the height in Centimeter
		}
		Collections.sort(al);
		System.out.println();
		System.out.println("4th tallest Student in the class "+al.get(3));
		int k = ss.nextInt();//Enter the k value for finding a particular value
		System.out.println("Kth tallest student in the class "+al.get(k-1));

	}
}
