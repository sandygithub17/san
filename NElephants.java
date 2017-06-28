package guvi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NElephants {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int n = ss.nextInt();
		int weight = ss.nextInt();
		int sum = 0;
		ArrayList<Integer> array = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			array.add(ss.nextInt());
		}
		Collections.sort(array);
		int k = 0;
		int count = 0;
		for(int j = 0; j < n; j++) {
				sum+= array.get(k++);
				if(sum <= weight) {
					count++;
				}
			}
		System.out.println(count);
	}

}
