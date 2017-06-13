package guvi;

import java.util.Scanner;

public class Ch_jjkElements {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.println("enter the array size");
		int arraysize = ss.nextInt();
		int[] num = new int[arraysize];
 		System.out.println("enter the array elements");
		for(int i = 0; i < num.length; i++) {
			num[i] = ss.nextInt();
		}
		ss.close();
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < num.length; j++) {
				for(int k = 0; k < num.length; k++) {
					if(num[i]+num[j] == num[k]) {
						System.out.println(num[i]+"+"+num[j]+"="+num[k]);
					}
				}
			}
		}
	}

}
