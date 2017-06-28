package guvi;

import java.util.Scanner;

public class EncodeTwoString {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		String str1 = ss.next();
		String str2 = ss.next();
		char[] ch = str1.toCharArray();
		char[] chh = str2.toCharArray();
		char[] ch1 = new char[str1.length()];
		char[] ch2 = new char[str2.length()];
		for(int i = 0; i < str1.length(); i++) {
			int num = (int)ch[i]+10;
			ch1[i] = (char)num;
		}
		String answer = "";
		for(int i=0;i<str2.length();i++){
			char c=str2.charAt(i);
			int a=(int)c;
			if(i!=0&&i!=str2.length()-1){
			if(c>=97&&c<=112){
			a+=10;	
			}
			else if(a>112&&a<=122){
				a=a+10-122;
				a+=96;
			}
			}
			answer+=(char)a;
		}
		String encode1 = new String(ch1);
		System.out.println(encode1);
		System.out.println(answer);
	}

}
