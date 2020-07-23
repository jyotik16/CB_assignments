package assignments;

public class lexicographicalCount_Recurn {
	public class Practice_recursion_print {
		static Scanner scn = new Scanner(System.in);

		public static void main(String[] args) {
			int n = scn.nextInt();
			lexicoCounting(0, n);

		}



		public static void lexicoCounting(int curr, int end) {

			if (curr > end) {
				// System.out.println(curr);
				return;
			}

			System.out.print(curr+" ");
			int i;

			if (curr == 0) {
				i = 1;
			} else {
				i = 0;
			}

			for (; i <= 9; i++) {
				lexicoCounting(curr * 10 + i, end);
			}

		}
	}

	
}
