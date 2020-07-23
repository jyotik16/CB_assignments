package assignments;

public class only_Ladder {
	
		static Scanner scn = new Scanner(System.in);

		public static void main(String[] args) {
			int end = scn.nextInt();
			boolean[] primes = SOE(end);
			int[] ladders = makeladders(primes);
			System.out.println(pathcount(ladders,0,end));
			path(ladders, 0, end, "");
		}

		public static int pathcount(int[] ladders, int curr, int end) {
			if (curr == end) {
				return 1;
			}
			if (curr > end) {
				return 0;
			}
			int count=0;
			if (ladders[curr] != 0) {
				count+=pathcount(ladders, ladders[curr], end);
			} else {
				for (int dice = 1; dice <= 6; dice++) {
					count+=pathcount(ladders, curr + dice, end);
				}
			}
			return count;
		}

		public static void path(int[] ladders, int curr, int end, String asf) {
			if (curr == end) {
				System.out.print(asf + " " + "END" + " ,");
				return;
			}
			if (curr > end) {
				return;
			}
			if (ladders[curr] != 0) {
				path(ladders, ladders[curr], end, asf + " " + curr);
			} else {
				for (int dice = 1; dice <= 6; dice++) {
					path(ladders, curr + dice, end, asf + " " + curr);
				}
			}
		}

		public static int[] makeladders(boolean[] primes) {
			int[] ladders = new int[primes.length];
			int left = 0;
			int right = primes.length - 1;
			while (left < right) {
				while (primes[left] == false) {
					left++;
				}
				while (primes[right] == false) {
					right--;
				}
				if (left < right) {
					ladders[left] = right;
					left++;
					right--;

				}
			}
			return ladders;
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


