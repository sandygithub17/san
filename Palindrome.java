package guvi;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=ss.nextInt();
		int orginalnum=num;
		int rem=0,rev_num=0;
		while(num!=0) {
			rem=num%10;
			rev_num=rev_num*10+rem;
			num/=10;
		}
		if(orginalnum == rev_num) {
			System.out.println("Given number is palindrom");
		}
		else {
			System.out.println("Given number is not palindrom");
		}
	}

}
