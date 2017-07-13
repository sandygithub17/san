package guvi;

public class UniqueInteger {

	public static void main(String[] args) {
		int[] arr = {1,2,6,9,9,1,3,6,2};
		for(int i = 0; i < arr.length; i++) {
			int count = 0;
			for(int j = 0; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			if(count < 2) {
				System.out.print(arr[i]+" ");
			}
		}

	}

}
