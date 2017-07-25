package guvi;

import java.util.Scanner;

public class Days {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		String days = ss.next();//enter day like mon tue wed thu fri
		if((days.equalsIgnoreCase("Mon")) || (days.equalsIgnoreCase("tue")) || (days.equalsIgnoreCase("wed")) || (days.equalsIgnoreCase("Thu")) || (days.equalsIgnoreCase("fri"))) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		ss.close();

	}

}
