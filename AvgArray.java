package guvi;

import java.util.Scanner;

public class AvgArray {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int n = ss.nextInt();
		int[] a = new int[n];
		int length = n/2;
		int b = 0; 
		int c = 0;
		int sum = 0;
		for(int i = 0; i < n; i++) {
			a[i] = ss.nextInt();
			if(i >= length) {
				b+= a[i];
			}
			else {
				c+= a[i];
			}
			sum+= a[i];
		}
		int avg = sum/n;
		int avg1 = c/length;
		int avg2 = b/(n-length);
		int j = a.length - avg;
		if(avg1 == avg2) {
			for(int i=0;i<=j;i++)
			 {
				 System.out.print(a[i]+" ");
			 }
			 System.out.print(", ");
			 for(int i=a.length-1;i>=avg;i--)
			 {
				 System.out.print(a[i]+" ");
			 }
		}
		else {
			System.out.println("Not Possible");
		}
		ss.close();
	}

}
