package assignments;

public class importance_of_time {
	public class IMPORTANCE_OF_TIME {
		static Scanner scn = new Scanner(System.in);

		public static void main(String[] args) {
			int n = scn.nextInt();
			int[] array1 = takeinput(n);
			int[] array2 = takeinput(n);
			int sum = 0;
			for (int i = 0; i < array1.length; i++) {
				if (array2[i] == array1[i]) {
					sum = sum + 1;
				} else {
//					int x = array1[i];
					for (int j = i; j < array1.length - 1; j++) {
						int temp = array1[j];
						array1[j] = array1[j + 1];
						array1[j + 1] = temp;
					}
//					array1[array1.length - 1] = x;
					sum = sum + 1;
					i--;
				}
			}
			System.out.println(sum);
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
