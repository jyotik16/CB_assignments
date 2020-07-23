package assignments;

public class painters_problem {
	public class Painters_partition_problem {
		static Scanner scn = new Scanner(System.in);

		public static void main(String[] args) {
			int k = scn.nextInt();
			int n = scn.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scn.nextInt();
			}
			// Arrays.sort(arr);
			System.out.println(min(arr, k, n));
		}

		public static long min(int[] arr, int k, int n) {

			long low = 0;
			long sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum = sum + arr[i];
				low	=Math.max(low, arr[i]);
			}
//			System.out.println(low);
			long high = sum;
			long max = 0;
			long mid;
			while (low <= high) {
				mid = (high + low) / 2;
				if (possible(arr, k, mid, n)) {
					max = mid;
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			}
			return max;
		}

		public static boolean possible(int[] arr, int k, long mid, int n) {
			int painters = 1;
			long curr_length = 0;
			for (int i = 0; i < arr.length; i++) {
				if (curr_length + arr[i] > mid) {
					painters++;
					curr_length = arr[i];
					if (painters > k) {
						return false;
					}
				} else {
					curr_length += arr[i];
				}
			}
			return true;
		}
	}

}
