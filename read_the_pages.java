package assignments;

public class read_the_pages {
	public class Read_the_pages {
		static Scanner scn = new Scanner(System.in);

		public static void main(String[] args) {
//			int t = scn.nextInt();

//			for (int i = 1; i <= t; i++) {
				int n = scn.nextInt();
				int m = scn.nextInt();
				int[] arr = new int[n];
				for (int x = 0; x < arr.length; x++) {
					arr[x] = scn.nextInt();
				}
				Arrays.sort(arr);
				System.out.println(max(arr, m, n));
			}
//		}

		public static long max(int[] arr, int m, int n) {
			long low = arr[arr.length - 1];
			// System.out.println(low);
			long sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum = sum + arr[i];
			}
			long high = sum;
			// System.out.println(high);
			long max = 0;
			long mid;
			while (low <= high) {
				mid = (high + low) / 2;
				// System.out.println(mid);
				if (possible(arr, mid, m, n)) {
					max = mid;
					high = mid - 1;
					// System.out.println(high);
				} else {
					low = mid + 1;
					// System.out.println(low);
				}

			}
			return max;
		}

		public static boolean possible(int[] arr, long mid, int m, int n) {
			long curr_sum = 0;
			int students = 1;
			for (int i = 0; i < arr.length; i++) {
				if (curr_sum + arr[i] > mid) {
					students++;
					curr_sum = arr[i];
					if (students > m) {
						return false;
					}
				} else {
					curr_sum += arr[i];
				}
			}
			return true;
		}
	}


}
