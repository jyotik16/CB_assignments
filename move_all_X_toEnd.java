package assignments;

public class move_all_X_toEnd {
	public class Move_all_x_at_end {

		public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			String str = scn.nextLine();
			System.out.println(all_x(str, new StringBuilder()));

		}

		public static String all_x(String str, StringBuilder sb) {
			if (str.length() == 1) {
				sb.append(str.charAt(str.length() - 1));
				return sb.toString();
			}
			char ch = str.charAt(0);
			String ros = str.substring(1);
			if (ch == 'x') {

			} else {
				sb.append(ch);
			}
			all_x(ros, sb);
			if (ch == 'x')
				sb.append(ch);
			return sb.toString();
		}
	}

}
