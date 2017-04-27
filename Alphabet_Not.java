package guvi;

import java.util.Scanner;

public class Alphabet_Not {

	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		System.out.println("enter the character");
		char ch=ss.next().charAt(0);
		if((ch>=65&&ch<=90)||(ch>=97&&ch<=122)) {
			System.out.println("Given character is Alphabet");
		}
		else {
			System.out.println("Given character is not Alphabet");
		}
		

	}

}
