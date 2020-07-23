package assignments;

public class dictionary_order_smaller {
	public class Test1 {
		static Scanner scn = new Scanner(System.in);

		public static void main(String[] args) {
			String str = scn.nextLine();

			permutationLexicoLarger(str, "", false, str);

		}

		public static void permutationLexicoLarger(String ques, String ans, boolean isSmaller, String match) {
			if (ques.length() == 0) {
				if (ans.equals(match)) {
					return;
				} else {
					System.out.println(ans);
					return;
				}
			}

			for (int i = 0; i < ques.length(); i++) {

				char ch = ques.charAt(i);
				String roq = ques.substring(0, i) + ques.substring(i + 1);
				if (isSmaller) {
					permutationLexicoLarger(roq, ans + ch, true, match);
				} else {
					if (ch > ques.charAt(0)) {

					} else if (ch < ques.charAt(0)) {
						permutationLexicoLarger(roq, ans + ch, true, match);
					} else {
						permutationLexicoLarger(roq, ans + ch, false, match);
					}
				}
			}

		}
	}

}
