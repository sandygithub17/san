package santhosh;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first name");
		String str1=sc.next();
		str1=str1.toUpperCase();
		char f=str1.charAt(0);
		char l=str1.charAt(str1.length()-1);
		System.out.println("Enter the Second name");
		String str2=sc.next();
		str2=str2.toLowerCase();
		char f1=str2.charAt(0);
		char l1=str2.charAt(str2.length()-1);
		System.out.println("Enter the 3digit");
		int n=sc.nextInt();
			n=(n/10)%10;
		System.out.println(f+""+l+""+n+""+f1+""+l1);	
		sc.close();
	}

}
