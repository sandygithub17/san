package guvi;

import java.util.Scanner;

public class VerticalLine {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		String input1 = ss.nextLine();
		String input2 = ss.nextLine();
		useVertical(input1, input2);
		ss.close();
	}
	
	public static void useVertical(String input1, String input2) {
		char[] ch1 = input1.toCharArray();
		char[] ch2 = input2.toCharArray();
		for(int i = 0; i < ch1.length; i++) {
			System.out.println(ch2[i]+""+ch1[i]);
		}
		if(ch1.length > ch2.length) {
			for(int i = ch2.length; i < ch1.length; i++) {
				System.out.println(ch1[i]);
			}
		}
		else {
			for(int i = ch1.length; i < ch2.length; i++) {
				System.out.println(ch2[i]);
			}
		}
		
	}
	/*Rene Decaretes once said,
"I think, therefore i am."*/
}
