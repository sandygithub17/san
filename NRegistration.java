package guvi;

import java.util.Scanner;

public class NRegistration {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int n = ss.nextInt();//enter number of reg number to be entered in array
		int[] regNo = new int[n];
		for(int i = 0; i < n; i++) {
			regNo[i] = ss.nextInt();
		}
		for(int i = 0; i < n-1; i++) {
			
			for(int j = i+1; j < n; j++) {
				
				if(regNo[i] == regNo[j]) {
					System.out.println("Reapiting number RegNo");
					System.out.println(regNo[i]);
				}
			}
		}

	}

}
