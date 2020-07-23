package assignments;

public class sumofMinAndMaxElementsinAllSubarrayofsize_k {
	
	public class Sum_of_minimum_And_Maximum_elements_of_subarray_of_size_k {
		static Scanner scn = new Scanner(System.in);

		public static void main(String[] args) {
			int t = scn.nextInt();
			for (int i = 1; i <= t; i++) {
				int n = scn.nextInt();
				int k = scn.nextInt();
				int[] arr = new int[n];
				for (int j = 0; j < arr.length; j++) {
					arr[j] = scn.nextInt();
				}
				System.out.println(min_max(arr, k, 0));
			}
		}

		public static int min_max(int[] arr, int k, int idx) {
			Stack<Integer> min = new Stack<Integer>();
			Stack<Integer> max = new Stack<Integer>();
			int sum = 0;
			while (idx != arr.length - k + 1) {
				min.push(arr[idx]);
				max.push(arr[idx]);
				for (int i = 0; i < k; i++) {
					if (min.peek() > arr[idx + i]) {
						min.pop();
						min.push(arr[idx + i]);
					}
					if (max.peek() < arr[idx + i]) {
						max.pop();
						max.push(arr[idx + i]);
					}
				}
				idx++;
			}
			while (!min.isEmpty()) {
				sum = sum + min.pop();
			}
			while (!max.isEmpty()) {
				sum = sum + max.pop();
			}
			return sum;
		}
	}


}
