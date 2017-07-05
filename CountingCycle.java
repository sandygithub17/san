package guvi;

import java.util.Scanner;

public class CountingCycle {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int index = ss.nextInt();
		int n = 3;
		int temp = n;
		int[] array = new int[index];
		for(int i = 1; i <= index; i++) {
			if(i == index) {
				break;
			}
			
			if(n == 1) {
				n = temp*2;
				temp = n;
			}
			else {
				n--;
			}
		}
		System.out.println(temp);
		ss.close();
	}

}
