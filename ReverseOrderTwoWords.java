package guvi;

import java.util.Scanner;

public class ReverseOrderTwoWords {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		String string = ss.nextLine();
		//String special = ("[]");
		String[] str = string.split("[\", .!@#$%%]");
		for(String s : str) {
			System.out.print(s+" ");
		}
		ss.close();

	}

}
