package guvi;

import java.util.Scanner;

public class AlexNotes {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int n = ss.nextInt();
		int k = ss.nextInt();
		int[] id = new int[k];
		boolean  check = false;
		String binary = ss.next();
		for(int i = 0; i < k; i++) {
			id[i] = ss.nextInt();
			if(binary.charAt(id[i] - 1) == '0') {
			check = true;
			}
		}
		if(check) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		ss.close();
	}

}
