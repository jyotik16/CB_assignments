package assignments;

public class SnakesandLadder {
	public class SnakesAndLadders {
		static Scanner scn = new Scanner(System.in);

		public static void main(String[] args) {
			int end = scn.nextInt();
			int m = scn.nextInt();
			int []dices=new int[m];
			for (int i = 0; i < m; i++) {
				dices[i] = scn.nextInt();
			}
			System.out.println(snl(snakes_and_ladders(SOE(end)), dices, 0, 0, end));

		}

		public static boolean snl(int[] snakes_and_ladders, int[] dices, int vidx , int curr, int end) {
			if (curr == end) {
				return true;
			}
			if (vidx == dices.length) {
				return false;
			}
			if (curr > end) {
				return false;
			}
			if (snakes_and_ladders[curr] != 0) {
				return snl(snakes_and_ladders, dices, vidx, snakes_and_ladders[curr], end);
			} else {
				while (vidx < dices.length - 1 && curr + dices[vidx] > end) {
					vidx++;
				}
				return snl(snakes_and_ladders, dices, vidx + 1, curr+dices[vidx], end);
			}
		}

		public static int[] snakes_and_ladders(boolean[] primes) {
			int left = 0;
			int right = primes.length - 1;
			int count = 1;
			int[] snakes_ladders = new int[primes.length];
			while (left < right) {
				while (primes[left] == false) {
					left++;
				}
				while (primes[right] == false) {
					right--;
				}
				if (left < right) {
					if (count % 2 == 0) {
						snakes_ladders[right] = left;
						count++;
					} else {
						snakes_ladders[left] = right;
						count++;
					}
					left++;
					right--;
				}
			}
			return snakes_ladders;
		}

		public static boolean[] SOE(int n) {

			boolean[] primes = new boolean[n + 1];
			Arrays.fill(primes, true);

			primes[0] = false;
			primes[1] = false;

			for (int table = 2; table * table <= n; table++) {

				if (primes[table] == true) {

					for (int mult = 2; mult * table <= n; mult++) {
						primes[mult * table] = false;
					}
				}

			}
			return primes;
		}
	}

}
