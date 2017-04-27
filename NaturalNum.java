package guvi;

import java.util.Scanner;

public class NaturalNum {

	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		int n=ss.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.println("sum of given natural number is "+sum);
	}

}
