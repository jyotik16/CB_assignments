package assignments;

import java.util.Scanner;

public class string_compression {
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String str = scn.nextLine();
		String str = "aaaddssssbbc";
		compress(str);
	}

	public static void compress(String str) {

		StringBuilder sb = new StringBuilder();
		int count = 1;
		char m = ' ';
		char n = ' ';
		// char t=' ';
		int f = 0;
		for (int i = 0; i < str.length(); i++) {
			m = str.charAt(i);
			count = 1;
			for (int j = i + 1; j < str.length(); j++) {
				// t=str.charAt(j-1);
				n = str.charAt(j);
                if (m == n) {
					count++;
				} else {
					f = 1;
				}
			}
			if (f == 1) {
				sb.append(m + "" + count);
			}
		}
		System.out.println(sb);
	}
}