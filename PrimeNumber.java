package guvi;

import java.util.Scanner;

public class PrimeNumber {

	
	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		int n=ss.nextInt();
			  int i,m=0,flag=0;      
			  m=n/2;    
			  for(i=2;i<=m;i++){    
			   if(n%i==0){    
			   System.out.println("Number is not prime");    
			   flag=1;    
			   break;    
			   }    
			  }    
			  if(flag==0)    
			  System.out.println("Number is prime");     
	}

}
