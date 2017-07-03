package guvi;

import java.util.Scanner;

public class LongestCommonPrefixString {
	
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		String[] str = new String[2];
		for(int i = 0; i < 2; i++) {
			str[i] = ss.nextLine();
		}
		ss.close();
		String a = str[0];
		String b = str[1];
		System.out.println(greatestCommonPrefix(a, b));
	}
	
	public static String greatestCommonPrefix(String a, String b) {
	    int minLength = Math.min(a.length(), b.length());
	    for (int i = 0; i < minLength; i++) {
	        if (a.charAt(i) != b.charAt(i)) {
	            return a.substring(0, i);
	        }
	    }
	    return a.substring(0, minLength);
	}

}
