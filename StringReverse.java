package guvi;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = ss.nextLine();
		String[] splitStr = str.split("\\ ");
		for(int i = 0; i < splitStr.length; i++) {
			String rev = new StringBuffer(splitStr[i]).reverse().toString();
			String first = rev.substring(0, 1).toUpperCase();
			String last = rev.substring(rev.length() - 1).toLowerCase();
			String second = rev.substring(1, rev.length()-1);
			System.out.print(first+""+second+""+last);
			System.out.print(" ");
		}
		ss.close();
	}

}
