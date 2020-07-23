package assignments;

public class string_String_compression {
	public class String_Compression {
		static Scanner scn = new Scanner(System.in);

		public static void main(String[] args) {
			String str = scn.nextLine();
			System.out.println(compression(str));
		}

		public static String compression(String str) {
			StringBuilder sb = new StringBuilder();
			char ch = str.charAt(0);
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ch) {
					count++;
				} else {
					sb.append(ch);

					if (count == 1) {
						count = 1;
					} else {
						sb.append(count);
						count = 1;
					}

				}
				ch = str.charAt(i);
			}
			sb.append(ch);
			if (count == 1) {

			} else
				sb.append(count);
			String s = sb.toString();
			return s;

		}
	}
}
