package santhosh;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = ss.next();
		System.out.println(new StringBuffer(str).reverse().toString());
		ss.close();
	}

}
