package programs1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the upper limit");
		int upplimit = ss.nextInt();
		System.out.println("Enter the lower limit");
		int lowlimit = ss.nextInt();
		ss.close();
		int count = 0;
		for(int i=upplimit;i<=lowlimit;i++) {
			boolean primenumber = true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					primenumber = false;
					break;
				}
			}
			if(primenumber) {
				count++;
			}
		}
		System.out.println(count+" prime number given range");
	}

}
