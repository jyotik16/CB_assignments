package assignments;

public class firstNegativeIntegerInEveryWindok_sizeK {
	public class first_negative_integer_in_every_size_of_window_k {
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
				first_negative(arr, k, 0);
			}
		}

		public static void first_negative(int[] arr, int k, int idx) {
			Queue<Integer> queue = new LinkedList<Integer>();

			while (idx != arr.length - k + 1) {
				for (int i = 0; i < k; i++) {
					if (arr[idx + i] < 0) {
						queue.add(arr[idx + i]);
						break;
					}

				}
				if (queue.isEmpty()) {
	                System.out.println("0"+" ");
				}
				while (!queue.isEmpty()) {
					System.out.print(queue.remove() + " ");
				}

				idx++;
			}

		}
	}

}
