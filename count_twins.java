package assignments;

public class count_twins {
	public class REcursion_Twins {

		public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			String str = scn.nextLine();
			System.out.println(twins(str));
		}

		public static int twins(String str) {
			if (str.length() == 2) {
				return 0;
			}
			char ch = str.charAt(0);
			String ros = str.substring(1);
			int count = 0;
			count += twins(ros);
			if (ch == ros.charAt(1)) {
				count++;
			}
			// } else {
			// twins(ros);
			// }
			return count;
		}
	}

}
