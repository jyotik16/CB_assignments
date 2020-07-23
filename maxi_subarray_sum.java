package assignments;

public class maxi_subarray_sum {
	public class Maximum_Subarray_Sum {
		static Scanner scn = new Scanner(System.in);

		public static void main(String[] args) {
			int t = scn.nextInt();
			for (int i = 1; i <= t; i++) {
				int n = scn.nextInt();
				int[] arr = new int[n];
				for (int j = 0; j < arr.length; j++) {
					arr[j] = scn.nextInt();
				}
				System.out.println(maxsubarray_sum(arr));
			}

		}

		public static int maxsubarray_sum(int[] arr) {
			int sum = 0;
			int max = Integer.MIN_VALUE;
			for (int i = 0; i < arr.length; i++) {
				sum = sum + arr[i];
				if(max<sum)
				{
					max=sum;
				}
				if (sum < 0) {
					sum = 0;
				} 
			}
			return max;
		}
	}
}
