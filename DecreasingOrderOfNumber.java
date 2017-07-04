package guvi;

import java.util.Scanner;

public class DecreasingOrderOfNumber {

	public static void main(String[] args) {
		
		Scanner ss = new Scanner(System.in);
		int n = ss.nextInt();
		int count = 0;
		int[] a = new int[n]; 
		int[] b = new int[n];
		String[] str = new String[n];
		for(int i = 0; i < a.length; i++) {
			a[i] = ss.nextInt();
		}
		
		for(int j = 0; j < a.length; j++) {
			str[j] = Integer.toBinaryString(a[j]);
		}
		
		for(int k = 0; k < str.length; k++) {
			count = 0;
			int t = str[k].length();
			for(int m = 0; m < t; m++) {
				char c = str[k].charAt(m);
				if(c == '1') {
					count++;
					b[k] = count;
				}
			}
		}

		for(int p = 0; p < n; p++) {
			for(int q = p+1; q < n; q++) {
				if(b[p] < b[q] ) {
					 int temp = a[p];
					a[p] = a[q];
					a[q] = temp;
					
					temp = b[p];
					b[p] = b[q];
					b[q] = temp;
				}
				else if(b[p] == b[q]) {
					if(a[p] < a[q]) {
						int temp = a[p];
						a[p] = a[q];
						a[q] = temp;
						
						temp = b[p];
						b[p] = b[q];
						b[q] = temp;
					}
				}
				
			}
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
	}

}
