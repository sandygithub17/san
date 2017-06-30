package guvi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DigitSuffel {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		String str = ss.nextLine();
		ss.close();
		ArrayList<Integer> array = new ArrayList<Integer>();
		int count = 0;
	    char[] ch = str.toCharArray();
	    for(int i = 0; i < ch.length; i++) {
		if(Character.isDigit(ch[i])) {
			array.add(Character.getNumericValue((int) ch[i]));
			count++;
		}
	    }
	    int maxsum = 0;
		int minsum = 0;
	    Collections.sort(array);
	    
	    for(int k = 0; k < count; k++) {
	    	maxsum+= (array.get(count-1)*array.get(k));
	    }
	    
	    for(int m = 0; m < count; m++) {
	    	minsum+= (array.get(0)*array.get(m));
	    }
	    int sum1 = 0;
	    int sum2 = 0;
	    while(maxsum > 0) {
	    	sum1+= maxsum%10;
	    	maxsum/=10;
	    }
	    while(minsum > 9) {
	    	sum2+= minsum%10;
	    	minsum/=10;
	    }
	    int squ1 = sum1%10;
	    squ1+= sum1/10;
	    int squ2 = sum2%10;
	    squ2+= sum2/10;
	    int min = 0;
	    min = Math.min(squ1, squ2);
	    int square = 0;
	    square = min*min;
	    System.out.println(square);
	
	}

}
