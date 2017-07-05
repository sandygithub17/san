package guvi;

import java.util.Scanner;

public class ASubStringOfB {
	static void compareString(String A, String B) {
		
			for(int i = 0; i <A.length()-1 ; i++) {
				String str = A.substring(i, i+2);
				if(B.indexOf(str) != -1) {
					System.out.println("true");
					return;
				}
			}
			System.out.println("false");
		
	}

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
	String A = ss.nextLine();
	String B = ss.nextLine();
	ss.close();
	if(A.length() < B.length()) {
		compareString(A,B);
	}
	else {
		compareString(B,A);
	}

	}

}
