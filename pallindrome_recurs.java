package assignments;

import java.util.Scanner;

public class pallindrome_recurs {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = takeinput();
		boolean temp = false;
		boolean ans = pallin(arr, 0,temp);
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

	public static boolean pallin(int[] arr, int i,	boolean temp) {
		// System.out.println(temp);
	
		if (i > (arr.length / 2) ) {
           
			return false;
		}
		int j = arr.length - 1 - i;

		if (arr[i] == arr[j]) {
			temp=true;
		}

		
				pallin(arr, i + 1,temp);
		// System.out.println(temp);
				return temp; 
	}
}