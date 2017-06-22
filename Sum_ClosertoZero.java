package guvi;

import java.util.Scanner;

public class Sum_ClosertoZero {

	public static void main(String[] args) {
		int n, min1 = 0, min2 = 1, sum, minimum;
        Scanner ss = new Scanner(System.in);
        System.out.print("Enter the number of elements you want:");
        n = ss.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the numbers:");
        for(int i = 0; i < n; i++)
        {
            a[i] = ss.nextInt();
        }
        minimum=Math.abs(a[0] + a[1]);
        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                sum = Math.abs(a[i] + a[j]);
                if(sum < minimum)
                {
                    min1 = i;
                    min2 = j;
                    minimum = sum;
                }
            }
        }
        System.out.println("Element closer to zero:"+a[min1]); 
        System.out.println("Element closer to zero:"+a[min2]);
        ss.close();
		
	}

}
