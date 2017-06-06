package santhosh;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		int n1=0;
		int n2=0;
		if(n%2==0) {
			for(int i=1;i<=n;i++)
				if(i%2==0) {
					n1=i*i*i;
					System.out.print(n1);
					if(i<n)
					System.out.print(", ");
				}
		}
		else {
			for(int i=0;i<=n;i++)
				if(i%2!=0) {
					n2=i*i*i;
					System.out.print(n2);
					if(i<n)
					System.out.print(", ");
				}
		}
		sc.close();

	}

}
