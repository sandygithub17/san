package guvi;

import java.util.Scanner;

public class LeapYear {

	
	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the year:");
		int year=ss.nextInt();
		 if(year%4 == 0) {
		        if( year%100 == 0) {
		            // year is divisible by 400, hence the year is a leap year
		            if ( year%400 == 0) {
		                System.out.println("Given year is leap year");	
		            }
		            else {
		            	System.out.println("Given year is not leap year");	
		            }            
		        }
		        else {
		        	System.out.println("Given year is leap year");	
		        }
		    }
		    else {
		    	System.out.println("Given year is not leap year");	
		    }	       
	}

}
