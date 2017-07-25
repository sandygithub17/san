package guvi;

import java.util.Scanner;

public class ConvertCharIntoAscii {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		String str = ss.nextLine();
		char[] ch = str.toCharArray();
		int[] ascii = new int[ch.length];
		int a = 0;
		for(int i = 0; i < ch.length; i++) {
			ascii[a] = ch[i];
			a++;
		}
		int sum = 0;
		for(int j = 0; j < ascii.length-1; j++) {
			sum+= ascii[j+1] - ascii[j]; 
		}
		sum = (char)ascii[0]-sum;
		System.out.println((char)sum); 
		ss.close();
	}

}
