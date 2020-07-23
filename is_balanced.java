package assignments;

public class is_balanced {
	public class Is_balanced {

		public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			String str = scn.nextLine();
			System.out.println(isbalanced(str, 0, str.length() - 1));
		}

		public static boolean isbalanced(String str, int start, int end) {
			
			if (start == str.length()) {
				return false;
			}
			if(end<0)
			{
			    return false;
			}
			if (start == end) {
				return false;
			}
			if (start > end) {
				return true;
			}
			if (str.charAt(start) == '(') {
				if (str.charAt(end) == ')') {
					return isbalanced(str, start + 1, end - 1);
				} else {
					return isbalanced(str, start + 1, end);
				}
			}
			if (str.charAt(start) == ')') {
				return isbalanced(str, start + 1, end - 1);
			}
			if (str.charAt(start) == '{') {
				if (str.charAt(end) == '}')
					return isbalanced(str, start + 1, end - 1);
				else
					return isbalanced(str, start + 1, end);
			}
			if (str.charAt(start) == '}') {
				return isbalanced(str, start + 1, end - 1);
			}
			if (str.charAt(start) == '[') {
				if (str.charAt(end) == ']')
					return isbalanced(str, start + 1, end - 1);
				else
					return isbalanced(str, start + 1, end);
			}
			if (str.charAt(start) == ']')
				return isbalanced(str, start + 1, end - 1);

			return isbalanced(str, start + 1, end);

		}

	}

}
