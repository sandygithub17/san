package guvi;

import java.util.Scanner;

public class GenerateUserID {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.print("First_Name = ");
		String str1 = ss.nextLine();
		System.out.print("Second_Name = ");
		String str2 = ss.nextLine();
		int len1 = str1.length();
		int len2 = str2.length();
		String small_Name = "";
		String large_Name = "";
		if(len1 < len2) {
			large_Name = str2;
		}
		else {
			small_Name = str2;
		}
		
		if(len1 > len2) {
			large_Name = str1;
		}
		else {
			small_Name = str1;
		}
		
		if(len1 == len2) {
			for(int i = 0; i < len1; i++) {
				if(str1.charAt(i) > str2.charAt(i)) {
					small_Name = str1;
				}
				else {
					large_Name = str2;
				}
			}
		}
		System.out.print("PIN = ");
		String pin = ss.next();
		System.out.print("n = ");
		int n = ss.nextInt();
		String num1 = pin.substring(n-1, n);
		String rev = new StringBuffer(pin).reverse().toString();
		String num2 = rev.substring(n-1, n);
		String toggle = large_Name.substring(0, 1)+small_Name;
		char[] ch = toggle.toCharArray();
		for(int j  = 0; j < toggle.length(); j++) {
		if(Character.isUpperCase(ch[j])) {
			ch[j] = Character.toLowerCase(ch[j]);
		}
		else {
			ch[j] = Character.toUpperCase(ch[j]);
		}
		}
		String userid = new String(ch);
		System.out.println(userid+num1+num2);
	}
}
