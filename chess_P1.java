package assignments;

public class chess_P1 {
	public class Chessboard1 {

		public static void main(String[] args) {

			Scanner scn = new Scanner(System.in);
			int n = scn.nextInt();
			System.out.println(chesscount(0, 0, n-1));
			c1(0, 0, n - 1, "");
		}

		public static int chesscount(int cr, int cc, int n) {

			if (cr == n && cc == n) {
				return 1;
			}

			if (cr > n || cc > n) {
				return 0;
			}
			int count = 0;
			// knight
			count += chesscount(cr + 2, cc + 1, n);
			count += chesscount(cr + 1, cc + 2, n);

			if (cr == 0 || cr == n || cc == 0 || cc == n) {

				// rook horizontal
				for (int col = 1; col <= n; col++) {
					count += chesscount(cr, cc + col, n);
				}

				// rook vertical
				for (int row = 1; row <= n; row++) {
					count += chesscount(cr + row, cc, n);
				}
			}

			if (cr == cc || cr + cc == n) {
				for (int d = 1; d <= n; d++) {
					count += chesscount(cr + d, cc + d, n);
				}
			}
			return count;
		}

		public static void c1(int cr, int cc, int n, String asf) {

			if (cr == n && cc == n) {
				System.out.print(asf + "{" + n + "-" + n + "}" + " ");
				return;
			}

			if (cr > n || cc > n) {
				return;
			}

			// knight
			c1(cr + 2, cc + 1, n, asf + "{" + cr + "-" + cc + "}" + "K");
			c1(cr + 1, cc + 2, n, asf + "{" + cr + "-" + cc + "}" + "K");

			if (cr == 0 || cr == n || cc == 0 || cc == n) {

				// rook horizontal
				for (int col = 1; col <= n; col++) {
					c1(cr, cc + col, n, asf + "{" + cr + "-" + cc + "}" + "R");
				}

				// rook vertical
				for (int row = 1; row <= n; row++) {
					c1(cr + row, cc, n, asf + "{" + cr + "-" + cc + "}" + "R");
				}
			}

			if (cr == cc || cr + cc == n) {
				for (int d = 1; d <= n; d++) {
					c1(cr + d, cc + d, n, asf + "{" + cr + "-" + cc + "}" + "B");
				}
			}
		}

	}

}
