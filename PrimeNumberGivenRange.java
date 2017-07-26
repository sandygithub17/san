package guvi;

import java.util.Scanner;

public class PrimeNumberGivenRange {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int a1 = ss.nextInt();//enter the range a1
		int a2 = ss.nextInt();//enter the range a2
		int b1 = ss.nextInt();//enter the range b1
		int b2 = ss.nextInt();//enter the range d2
		callMethod(a1,a2);
		callMethod(b1,b2);
		ss.close();
	}
	public static void callMethod(int n1, int n2) {
		int count = 0;
		for(; n1 <= n2; n1++) {
			int temp = 0;
			int sum = 0;
			int x = n1;
			while(x > 0) {
				sum+= x%10;
				x/=10;
			}
			for(int j = 2; j <= sum; j++) {
				if(sum % j == 0) {
					temp++;
			    }
			}
			if(temp == 1) {
				count++;
			}
		}
		System.out.println(count);
	}	

}
