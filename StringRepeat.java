package guvi;

public class StringRepeat {

	
		public static String repeat(String str, int times) {
	        return new String(new char[times]).replace("\0", str);
	    }
	    public static void main(String[] args) {
	        System.out.println(repeat("Hello ", 5));
	    }
	}
