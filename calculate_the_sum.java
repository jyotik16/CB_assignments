package assignments;

import java.util.Scanner;

public class calculate_the_sum {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = takeinput();

		operation(arr);
		// System.out.println(f);
	}

	public static int[] takeinput() {
		// System.out.println("n");
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}

	public static void operation(int[] arr) {

		int f = arr[arr.length - 1];
		int test = scn.nextInt();
		for (int i = 0; i < test; i++) {
			// System.out.println("opr");
			int opr = scn.nextInt();
			for (int j = 0; j < opr; j++) {
				// System.out.println("X");
				int X = scn.nextInt();
				if (X > 0) {
					for (int k = arr.length - 1; k > 0; k--) {

						arr[k] = arr[k] + arr[k - X];

					}
					arr[0] = arr[0] + f;
				}
				if (X == 0) {
					for (int a = 0; a < arr.length; a++) {

						arr[a] = arr[a] + arr[a];

					}
				}
			}

			answer(arr);
		}

	}

	public static void answer(int[] arr) {
		long sum = 0;
		for (int i = 0; i < arr.length; i++) {

			sum += arr[i];
		}
		long ans = sum % (10 ^ 9 + 7);
		System.out.println(sum);
	}
}
