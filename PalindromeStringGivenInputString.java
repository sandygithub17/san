package guvi;

import java.util.Scanner;

public class PalindromeStringGivenInputString {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
	    String str=s.next();
	    int temp=0;
	    String pal="";
	    StringBuffer st=new StringBuffer(str);
	    for(int i=0;i<=st.length();i++){
	    	for(int j=i+1;j<=st.length();j++){
	    		StringBuffer sb=new StringBuffer(st.substring(i,j));
	    		String a=st.substring(i,j);
	    		String b=sb.reverse().toString();	    
	    		if(a.equals(b)){
	    			int max=a.length();
	    			if(max>temp){
	    				temp=max;
	    				pal=a;
	    			}
	    		} 		
	    	}
	    }
System.out.println(pal);
		s.close();

	}

}
