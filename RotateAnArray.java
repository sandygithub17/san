package guvi;

import java.util.Scanner;

public class RotateAnArray {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.println("enter the array size");
		int arraysize = ss.nextInt();
		int[] num = new int[arraysize];
		int k = 0;
 		System.out.println("enter the size of array");
		for(int i = 0; i < num.length; i++) {
			num[i] = ss.nextInt();
		}
		System.out.print("enter the k value ");
		 k = ss.nextInt();
		 for (int i = 0; i < k; i++) {
				for (int j = num.length - 1; j > 0; j--) {
					int temp = num[j];
					num[j] = num[j - 1];
					num[j - 1] = temp;
				}
			}
		 for(int i = 0; i < num.length; i++) {
			 System.out.print(num[i]+" ");
		 }
		 ss.close();
	}

}
