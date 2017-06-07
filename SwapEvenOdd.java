package santhosh;

import java.util.Scanner;

public class SwapEvenOdd {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = ss.next();
		char[] ch = str.toCharArray();
		char temp;
		if(str.length()%2==0) {
		for(int i=0;i<ch.length;i+=2) {
			temp = ch[i];
			ch[i] = ch[i+1];
			ch[i+1] = temp;
		}
		for(int j=0;j<ch.length;j++) {
		System.out.print(ch[j]);
		}
		}
		else {
			System.out.println(" please enter the even number length of the string");
		}
		ss.close();
	}

}
