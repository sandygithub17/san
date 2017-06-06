package santhosh;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Size of array");
		int n=sc.nextInt();
		int[] Evenarray=new int[20];
		int[] Oddarray=new int[20];
		int count1=0;
		int count2=0;
		int count3=0;
		int a=0,b=0;
		int[] array=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
			count1++;
			if(array[i]%2==0||array[i]==0) {
				Evenarray[a]=array[i];
				count2++;
				a++;
			}
			else {
				count3++;
				Oddarray[b]=array[i];
				b++;
			}
		}
		for(int i=0;i<count2;i++) {
		System.out.println("Even array:"+Evenarray[i]);
		}
		for(int i=0;i<count3;i++) {
		System.out.println("Odd array:"+Oddarray[i]);
		}
		System.out.println("Count of the orginal array:"+count1);
		System.out.println("Count of the even array:"+count2);
		System.out.println("Count of the Odd array:"+count3);
		sc.close();

	}

}
