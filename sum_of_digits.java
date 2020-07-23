package assignments;

import java.util.Scanner;

public class sum_of_digits {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = scn.nextLine();
		int sum = 0;
		add(str, sum, 0);

	}

	public static void add(String str, int sum, int i) {
		if (i == str.length()) {
			System.out.println(sum);
			return;
		}
		char m = str.charAt(i);
		
		int d = m - '0';

		sum = sum + d;
		add(str, sum, i + 1);
	}
}