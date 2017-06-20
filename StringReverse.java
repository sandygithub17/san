package guvi;

import java.util.Scanner;

 class Formatter { 
	 public static String reverseWord(String str){  
    String words[]=str.split("\\s");  
    String reverseWord="";  
    for(String w:words){  
        StringBuilder sb=new StringBuilder(w);  
        sb.reverse();  
        reverseWord+=sb.toString()+" ";  
    }  
    return reverseWord.trim();  
}  
}  
public class StringReverse {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		String str = ss.nextLine();
		System.out.println(Formatter.reverseWord(str));
	}
}
