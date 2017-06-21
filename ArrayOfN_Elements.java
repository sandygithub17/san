package guvi;

import java.util.Scanner;

public class ArrayOfN_Elements {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter  n elements ");
		int n = ss.nextInt();
		int[] arr = new int[n];
		int[] repeat = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = ss.nextInt();
		}
		int a = 0;
		for(int j = 0; j < arr.length; j++) {
			for(int k = j+1; k < arr.length; k++)
			if(arr[j] == arr[k]) {
				repeat[a++] = arr[j];
			}
		}
		System.out.println(repeat[0]);
		ss.close();
	}

}
