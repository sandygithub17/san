package guvi;

public class ArraySubSet {
	public static void compareArray(int[] a1, int[] a2) {
		boolean check = false;
		for(int i = 0; i < a1.length; i++) {
			for(int j = 0; j < a2.length; j++) {
				if((a1[i] == a2[j]) && (a1[i+1] == a2[j+1])) {
					check = true;
				}
			}
		}
		if(check) {
			System.out.println("Having subset");
		}
		else {
			System.out.println("Not having subset");
		}
	}

	public static void main(String[] args) {
		int[] a1 = {1, 2, 3, 4, 5, 6};
		int[] a2 = {7, 8, 9, 1, 10};
		System.out.println();
		if(a1.length < a2.length) {
			compareArray(a1, a2);
		}
		else {
			compareArray(a2, a1);
		}

	}

}
