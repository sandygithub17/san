package guvi;

import java.util.Scanner;

public class LessTheSpaceTwoString {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the stirng");
		String str = ss.nextLine();
		String after = str.replaceAll("\\s+", " ");
		System.out.println(after);
		ss.close();
	}

}
