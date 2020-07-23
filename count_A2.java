package assignments;

public class count_A2 {
	public class Count_AAA {

		public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			String str = scn.nextLine();
			System.out.println(count_with_overlap(str));
			System.out.println(count_without_overlap(str));

		}

		public static int count_with_overlap(String str) {
			if (str.length() == 2) {
				return 0;
			}
			char ch = str.charAt(0);
			String ros = str.substring(1);
			int count = 0;
			count += count_with_overlap(ros);
			if (ch == 'a') {
				if (ch == ros.charAt(0) && ch == ros.charAt(1)) {
					count++;
				}
			}

			return count;
		}

		public static int count_without_overlap(String str) {
			if (str.length() <= 2) {
				return 0;
			}
			char ch = str.charAt(0);
			String ros = str.substring(1);
			int count = 0;
			if (ch == 'a' && ros.charAt(0) == 'a' && ros.charAt(1) == 'a') {
				String roq = str.substring(3);
				count += count_without_overlap(roq);
			} else {
				count += count_without_overlap(ros);
			}
			if (ch == 'a') {
				if (ros.charAt(0) == 'a' && ros.charAt(1) == 'a') {
					count++;
				}
			}
			return count;
		}
	}

}
