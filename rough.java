package assignments;

import java.util.Scanner;

public class rough {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = n / 2 + 1;
		int nsp = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = nst; j >= 1; j--) {

				System.out.print("*");
			}
			nst = nst - 1;

			for (int j = 1; j <= nsp; j = j + 2) {

				System.out.print("0");
			}
			nsp = nsp + 2;
			for (int j = nst; j >= 1; j--) {

				System.out.print("*");
			}
			nst = nst - 1;
		}
		System.out.println();

	}

}
