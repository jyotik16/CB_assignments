package assignments;

public class ASCII_subsequences_RECURN {
	public class Practice_recursion_print {
		static Scanner scn = new Scanner(System.in);

		public static void main(String[] args) {
			String str = scn.nextLine();
			System.out.println(printSSAsciiCount(str, ""));
			printSSAscii(str, "");
		}

		public static int printSSAsciiCount(String str, String ans) {
			if (str.length() == 0) {
//				System.out.print(ans + " ");
				return 1;
			}
			char ch = str.charAt(0);
			String ros = str.substring(1);
			int count=0;
			count+=printSSAsciiCount(ros, ans);
			count+=printSSAsciiCount(ros, ans + ch);
			count+=printSSAsciiCount(ros, ans + (int) ch);
			return count;
		}

		public static void printSSAscii(String str, String ans) {
			if (str.length() == 0) {
				System.out.print(ans + " ");
				return;
			}
			char ch = str.charAt(0);
			String ros = str.substring(1);
			printSSAscii(ros, ans);
			printSSAscii(ros, ans + ch);
			printSSAscii(ros, ans + (int) ch);

		}
	}

}
