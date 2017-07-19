package guvi;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class LengthOfSubString {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String str = ip.next();
		char[] ch = str.toCharArray();
		LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
		for(int i = 0; i < ch.length; i++) {
			hs.add(ch[i]);
		}
		String subStirng = "";
		for(char c : hs) {
			subStirng+= c;
		}
		String subStirng1 = subStirng;
			if(str.contains(subStirng)) {
				System.out.println(subStirng);
			}
			else {
				String temp = subStirng1.substring(1, subStirng1.length());
				if(str.contains(temp)) {
					System.out.println(temp);
				}
			}
			ip.close();
	}

}
