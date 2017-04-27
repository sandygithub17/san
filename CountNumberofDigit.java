package guvi;

import java.util.Scanner;

public class CountNumberofDigit {

	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the digits");
		int n=ss.nextInt();
		int i=0,rem=0;
		int count=0;
		while(n>0) {
			rem=n%10;
			n/=10;
			count++;
		}
		System.out.println(count);

	}

}
