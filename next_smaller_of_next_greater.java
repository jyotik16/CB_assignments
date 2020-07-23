package assignments;

public class next_smaller_of_next_greater {
	public class NEXT_SMALLER_OF_NEXT_GREATER {
		static Scanner scn = new Scanner(System.in);

		public static void main(String[] args) {
			int t = scn.nextInt();
			for (int i = 1; i <= t; i++) {
				int n = scn.nextInt();
				int min = 0;
				int[] arr = takeinput(n);
				for (int j = 0; j < arr.length - 1; j++) {
					min = arr[j];

					int x;
					boolean flag = true;

					for (x = j + 1; x < arr.length; x++) {
						if (arr[x] > min) {
							flag = false;
							break;
						}
					}

					if (flag == false) {
						boolean flag1 = true;
						int val = arr[x];
						int k;
						for (k = x; k < arr.length; k++) {
							if (arr[k] < val) {
								flag1 = false;
								break;
							}
						}
						if (flag1 == false) {
							System.out.print(arr[k] + " ");
						} else {
							System.out.print("-1 ");
						}
					} else {
						System.out.print("-1 ");
					}
				}
				System.out.print("-1");
				System.out.println();
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
