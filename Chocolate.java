package guvi;

import java.util.Scanner;
class Cuts {
	int m = 0;
	int n = 0;
	int sum = 0;
	void mohammad(int m, int n) {
		this.m = m;
		this.n = n;
		if(m != 0 || n != 0) {
			sum = ((m*n)-1);
		}
		System.out.println(sum);
	}
}

public class Chocolate {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		Cuts c = new Cuts();
		System.out.println("Enter the M  and N value");
		int m = ss.nextInt();
		int n = ss.nextInt();
		c.mohammad(m, n);
		

	}

}
