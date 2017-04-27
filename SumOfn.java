package guvi;

import java.util.Scanner;

public class SumOfn {

	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		int n=ss.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum+=i;
		}
		System.out.println("sum of N is "+sum);

	}

}
