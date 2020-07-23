package assignments;

import java.util.Scanner;

public class median_of_sortedArray {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = takeinput();
		int[] array2 = takeinput1(array1);

		median(array1, array2);

	}

	public static int[] takeinput() {
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}

	public static int[] takeinput1(int[] array1) {

		int[] arr = new int[array1.length];
		for (int i = 0; i < array1.length; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}

	public static void median(int[] array1, int[] array2) {
		int[] array3 = new int[array1.length + array2.length];
		for (int i = 0; i < array1.length; i++) {
			array3[i] = array1[i];
		}
		for (int i = 0; i < array2.length; i++) {
			array3[array2.length + i] = array2[i];
		}
		array3 = sort(array3);
		for (int i = 0; i < array3.length; i++) {
			System.out.println(array3[i]);
		}
		int low = 0;
		int high = array3.length - 1;
		int mid = (low + high) / 2;
		System.out.println(array3[mid]);
	}

	public static int[] sort(int[] array3) {
		for (int counter = 0; counter < array3.length - 1; counter++) {
			for (int j = 0; j < array3.length - 1 - counter; j++) {
				if (array3[j] > array3[j + 1]) {
					int temp = array3[j];
					array3[j] = array3[j + 1];
					array3[j + 1] = temp;
				}
			}

		}
		return array3;

	}

}
