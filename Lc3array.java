package santhosh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lc3array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<Integer>();
		System.out.println("Enter the array");
		for(int i=0;i<10;i++) {
			array.add(sc.nextInt());
		}
		Collections.sort(array);
		int a=0;
		System.out.println("The min elements:");
		for(int j=0;j<3;j++) {
			System.out.println(array.get(a++));
		}
		int b=9;
		System.out.println("The max elements:");
		for(int k=0;k<3;k++) {
			System.out.println(array.get(b--));
		}
		sc.close();
	}

}
