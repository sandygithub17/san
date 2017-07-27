package guvi;

import java.util.Scanner;

public class PasswordGenerateTwoString {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		String firstName = ss.next();
		String secondName = ss.next();
		if(firstName.length() > secondName.length()) {
			useMethod(firstName, secondName);
		}
		else {
			useMethod(secondName, firstName);
		}
		ss.close();

	}
	
	public static void useMethod(String fName, String sName) {
		int sLength = sName.length();
		String password = "";
		for(int i = 0; i < sLength; i++) {
			password+= sName.substring(i, i+1) + fName.substring(i, i+1);
		}
		int a = 1;
		for(int j = sLength; j < fName.length(); j++) {
			password+= a + fName.substring(j, j+1);
			a++;
		}
		System.out.println(password);
	}
	
}
