package guvi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FindIndexPosition {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int n = ss.nextInt();//enter number of elements in array
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			al.add(ss.nextInt());
		}
		Collections.sort(al);
		System.out.println("Enter the element to search");
		int f = ss.nextInt();
		int position = al.indexOf(f);
		System.out.println("index positon");
		System.out.println(position);
	}

}
