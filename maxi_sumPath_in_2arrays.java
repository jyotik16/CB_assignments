package assignments;

public class maxi_sumPath_in_2arrays {
	public class Maximum_Sum_in_two_Arrays {
		static Scanner scn = new Scanner(System.in);

		public static void main(String[] args) {
			int t = scn.nextInt();
			for (int x = 1; x <= t; x++) {
				int n = scn.nextInt();
				int m = scn.nextInt();
				int[] arr1 = takeinput(n);
				int[] arr2 = takeinput(m);
				int i = 0, j = 0;
			    int sum1 = 0,sum2 = 0, sum = 0;
				while (i < n && j < m) {
					// if (i + 1 == arr1.length) {
					// sum = sum + arr1[i];
					// break;
					// }
					// if (j + 1 == arr2.length) {
					// sum = sum + arr2[j];
					// break;
					// }
					// if (arr1[i] + arr1[i + 1] < arr2[j] + arr2[j + 1]) {
					// if (arr1[i] == arr2[j + 1]) {
					// sum = sum + arr1[i];
					// sum=sum+arr1[i+1];
					// i++;
					// j++;
					// }
					// sum = sum + arr2[j];
					// i++;
					// j++;
					// } else if (arr1[i] + arr1[i + 1] > arr2[j] + arr2[j + 1]) {
					// if (arr1[i] == arr2[j + 1]) {
					// sum = sum + arr2[j];
					// sum=sum+arr2[j+1];
					// i++;
					// j++;
					// }
					// sum = sum + arr1[i];
					// i++;
					// j++;
					// } else if (arr1[i] + arr1[i + 1] == arr2[j] + arr2[j + 1]) {
					// if (arr1[i] > arr2[j]) {
					// sum = sum + arr1[i];
					// i++;
					// } else if (arr1[i] < arr2[j]) {
					// sum = sum + arr2[j];
					// j++;
					// }
					// }
					// }
					// System.out.println(sum);
					// }
					if (arr1[i] > arr2[j]) {
						sum2 = sum2 + arr2[j];
						j++;
					} else if (arr1[i] < arr2[j]) {
						sum1 = sum1 + arr1[i];
						i++;
					} else {
						sum = sum+Math.max(sum1, sum2);
						sum1 = 0;
						sum2 = 0;
						while (i < n && j < m && arr1[i] == arr2[j]) {
							sum = sum + arr1[i];
							i++;
							j++;
						}
					}

				}
				while (i < n) {
					sum1 = sum1 + arr1[i];
					i++;
				}
				while (j < m) {
					sum2 = sum2 + arr2[j];
					j++;
				}
				if (sum1 > sum2) {
					sum = sum+sum1;
				} else {
					sum = sum+sum2;
				}
				System.out.println(sum);
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
