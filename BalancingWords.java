package guvi;

import java.util.Scanner;

public class BalancingWords {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		String balanceStr = ss.next().toLowerCase();
		char[] ch = balanceStr.toCharArray();
		int[] num = new int[ch.length];
		for(int i = 0; i < ch.length; i++) {
			if((ch[i] >= 'a') && (ch[i] <= 'm')) {
				num[i] = 1;
			}
			
			else if((ch[i] >= 'n') && (ch[i] <= 'z')) {
				num[i] = 0;
			}
		}
		boolean check = false;
		if(num.length%2 == 0) {
			for(int j = 0; j < num.length; j+=2) {
				if((num[j] == 0) && (num[j+1] == 1)) {
					check = true;
				}
			}
		}
		else {
			int j = 0;
				if((num[j] == 0) && (num[j+1] == 1) && (num[j+2] == 0)) {
					check = true;
			}
		}
		
		if(check == true) {
			System.out.println(balanceStr+" is balanced");
		}
		else {
			System.out.println(balanceStr.toUpperCase()+" is not balanced");
		}
		ss.close();
	}

}
