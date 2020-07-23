package assignments;

import java.util.Scanner;

public class log {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int X = scn.nextInt();
		int N = scn.nextInt();

		int i = 0;

		while (X != 0) {
			X = X / N;
			i = i + 1;

		}
		System.out.println(i - 1);

	}

}
