package assignments;

public class subset_problem {
	public class subset_target {

		public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			int n = scn.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scn.nextInt();
			}
			int target_e = scn.nextInt();
			System.out.println(target_cn(arr, target_e, 0,"",0));
			target(arr, target_e, 0, "", 0);
		}

		public static int target_cn(int[] arr, int target, int idx, String ans, int sum) {
			if (idx == arr.length) {
				if (sum == target) {
//					System.out.print(ans + " ");
					return 1;
				}

				return 0;
			}
			int count = 0;
			count += target_cn(arr, target, idx + 1, ans + arr[idx] + " ", sum + arr[idx]);

			count += target_cn(arr, target, idx + 1, ans, sum);
			return count;
		}

		public static void target(int[] arr, int target, int idx, String ans, int sum) {
			if (idx == arr.length) {
				if (sum == target) {
					System.out.print(ans + " ");
				}

				return;
			}
			target(arr, target, idx + 1, ans + arr[idx] + " ", sum + arr[idx]);

			target(arr, target, idx + 1, ans, sum);
		}
	}
}
