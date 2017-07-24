package guvi;

import java.util.Scanner;

public class RemoveExistCharacter {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		String str = ss.nextLine();
		char[] ch = str.toCharArray();
		int count;
		for(int i = 0; i < ch.length; i++) {
			count = 1;
			for(int j = i+1; j < ch.length; j++) {
				if(ch[i] == ch[j]) {
					count++;
					ch[j] = '\0';
				}
			}
			if((ch[i] != '\0') && (count == 1)) {
			System.out.print(ch[i]);
		}
		}		ss.close();
	}

}
