package guvi;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		System.out.println("enter the character");
		char ch=ss.next().charAt(0);
		if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'
				||ch=='u'||ch=='U') {
			System.out.println("Given character is vowel");
		}
		else {
			System.out.println("Given character is consonant");
		}

	}

}
