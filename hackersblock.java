package lecture4;

import java.util.Scanner;

public class hackersblock {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		for (int i = 1; i <= n; i++) {

			int f = 1;
			for (int a = 2; a < i; a++) {
				if (i % a == 0) {
					f = 0;

				}
			}

			if (f == 1) {
				System.out.println(i);
			}
		}
	}
}
