package assignments;

import java.util.Scanner;

public class pallind_string {

	static Scanner scn = new Scanner(System.in);

	public static void main(String args[]) {

		String ques = scn.nextLine();
		String ans = "";
		int fin = countpermutations(ques, ans);
		System.out.println(fin);
		permutation(ques, ans);

	}

	public static int permutation(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return 1;
		}

		int count = 0;
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			String ros = ques.substring(0, i) + ques.substring(i + 1);
			count += permutation(ros, ans + ch);

		}
		return count;
	}

	public static int countpermutations(String ques, String ans) {
		if (ques.length() == 0) {

			return 1;
		}
		int count = 0;
		for (int i = 0; i < ques.length(); i++) {
			char c = ques.charAt(i);
			String ros = ques.substring(0, i) + ques.substring(i + 1);
			count += countpermutations(ros, ans + c);
		}
		return count;
	}
}
