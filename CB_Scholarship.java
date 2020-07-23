package assignments;

public class CB_Scholarship {
	public class winning_cb_scholarship {
		static Scanner scn = new Scanner(System.in);

		public static void main(String[] args) {
			long n = scn.nextInt();
			long m = scn.nextInt();
			long x = scn.nextInt();
			long y = scn.nextInt();
			System.out.println(students(n, m, x, y));

		}

		public static long students(long n, long m, long x, long y) {
			long low =0;
			long high = n;
			long max = 0;
			long mid;
			while (low <= high) {
				mid = (low + high) / 2;
				if (ispossible(n, m, mid, x, y)) {
					low = mid + 1;
					max=(long)Math.max(max, mid);
				} else {
					high = mid - 1;
				}
			}
			return max;
		}

		public static boolean ispossible(long n, long m, long mid, long x, long y) {
			long a=mid*x;
			long b=m+(n-mid)*y;
			return (a<=b);
		}
	}

}
