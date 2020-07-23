package assignments;

import java.util.Scanner;

public class upper_lower_bound {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = takeinput();

		bound(arr);
	}

	public static int[] takeinput() {
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}

	public static void bound(int[] arr) {
		int test = scn.nextInt();

		int f = 0;
		int j = 0;

		for (int i = 0; i < test; i++) {

			int target = scn.nextInt();
			for (j = 0; j < arr.length; j++) {
				if (target != arr[j]) {
					f = 0;
				} else {
					f = 1;
				}

				for (int k = j + 1; k < arr.length; k++) {
					if (target == arr[j] && target == arr[k]) {

						System.out.print(j + " " + k);
						j++;
						return;

					}

				}

				if (f == 1) {
					System.out.println(j + " " + j);
					return;
				}

			}
			if (f == 0) {
				System.out.println(-1 + " " + "-1");
				return;
			}

		}
	}
}