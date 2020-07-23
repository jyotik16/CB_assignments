package assignments;

import java.util.Scanner;

public class hour_glass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner scn = new Scanner(System.in);
		// int n = scn.nextInt();
		int n = 5;
		int row = 1;
		int nst1 = 1;
		int nst2 = 1;
		int nsp = 2 * n - 1;
		int val = n;
		int temp = val;
		for (row = 1; row <= 2 * n + 1; row++) {
			temp = n;
			for (int cst = 1; cst <= nst1; cst++) {

				System.out.print(temp + " ");
				temp--;
			}
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" " + " ");
			}
			if(row==n+1) {
				for (int cst = nst2; cst >1; cst--) {
					System.out.print(val + " ");
				val--;
				}
			}else {
			
			for (int cst = 1; cst <=nst2; cst++) {
				System.out.print(val + " ");
			val++;
			}
			}
			if (row <= n) {
				nst1 = nst1 + 1;
				nst2 = nst2 + 1;
				nsp = nsp - 2;
				// val=5;
			} else {
				nst1 -= 1;
				nst2 = nst2 - 1 ;
				nsp += 2;
				// val=5;
			}
			
			
			
			
			
			System.out.println();
		}
	}

}
