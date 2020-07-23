package assignments;

import java.util.Scanner;

public class contained_in_array {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = takeinput();
		int m = scn.nextInt();
		boolean ans = contain(array, 0, m);
		System.out.println(ans);
	}

	public static int[] takeinput() {
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}

	public static boolean contain(int[] array, int i, int m) {

		if (i == array.length) {
			return false;
		}

		int j = array[i];

		if (j == m) {

			return true;
		}
		return contain(array, i + 1, m);

	}

}
