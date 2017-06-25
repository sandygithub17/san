package guvi;

import java.util.Scanner;
class Parse {
	String str;
void pangram(String str) {
		this.str = str.toLowerCase();
		if(str.length() < 26) {
			System.out.println("Given string is not Pangram");
		} else {
			for(char ch = 'a'; ch <= 'z'; ch++ ) {
				if(str.indexOf(ch) < 0) {
					System.out.println("Given string is not Pangram");
				}
			}
			System.out.println("Given string is Pangram");
		}
		
	}
}

public class PangramOrNot {
	
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		String str = ss.nextLine();
		Parse pp = new Parse();
		pp.pangram(str);
		
		
		

	}

}
