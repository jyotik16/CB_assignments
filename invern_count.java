package assignments;

public class invern_count {
	public class INVERSION_COUNT {
		static Scanner scn = new Scanner(System.in);

		public static void main(String[] args) {
			int t = scn.nextInt();
			
			for (int x = 1; x <= t; x++) {
				int count = 0;
				int n = scn.nextInt();
				int[] arr = takeinput(n);
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr.length; j++) {
						if (i < j && arr[i] > arr[j]) {
							count++;
						}

					}
				}
				System.out.println(count);
			}
		}

		public static int[] takeinput(int n) {

			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scn.nextInt();
			}
			return arr;
		}
	}

}
