package assignments;

import java.util.Scanner;

public class permu_of_string {

	static Scanner scn = new Scanner(System.in);

	public static void main(String args[]) {

		String ques = scn.nextLine();
		String ans = "";
		int res = noofpermutations(ques, ans);
		System.out.println(res);
		permutation(ques, ans);

	}

	public static int permutation(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans + " ");
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

	public static int noofpermutations(String ques, String ans) {
		if (ques.length() == 0) {

			return 1;
		}
		int count = 0;
		for (int i = 0; i < ques.length(); i++) {
			char c = ques.charAt(i);
			String ros = ques.substring(0, i) + ques.substring(i + 1);
			count += noofpermutations(ros, ans + c);
		}
		return count;
	}
}
