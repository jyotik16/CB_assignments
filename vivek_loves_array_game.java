package assignments;

public class vivek_loves_array_game {
	public class pracc {

		   static Scanner scn = new Scanner(System.in);

		   public static void main(String[] args) {
		       int test = scn.nextInt();

		       while (test-- != 0) {
		           int n = scn.nextInt();
		           int[] arr = new int[n];
		           for (int i = 0; i < n; i++) {
		               arr[i] = scn.nextInt();
		           }
		           int ans = divideArr(arr);
		           System.out.println(ans);
		       }
		   }

		   public static int divideArr(int[] arr) {
		       int sum = 0;
		       for (int i = 0; i < arr.length; i++) {
		           sum += arr[i];
		       }
		       if (sum % 2 != 0) {
		           return 0;
		       }
		       int index = CheckSplit(arr);
		       if (index == -1 || index == arr.length - 1) {
		           return 0;
		       }
		       int[] ar1 = takeInputFirst(arr, index + 1);
		       int[] ar2 = takeInputSecond(arr, arr.length - index - 1);
		       int count = 1, count1 = 0, count2 = 0;
		       count1 += divideArr(ar1);
		       count2 += divideArr(ar2);
		       if (count1 > count2)
		           count += count1;
		       else
		           count += count2;
		       return count;
		   }

		   public static int[] takeInputFirst(int[] arr, int n) {
		       int[] ar1 = new int[n];
		       for (int i = 0; i < n; i++) {
		           ar1[i] = arr[i];
		       }
		       return ar1;
		   }

		   public static int[] takeInputSecond(int[] arr, int n) {
		       int[] ar2 = new int[n];
		       for (int i = 0; i < n; i++) {
		           ar2[i] = arr[arr.length - n + i];
		       }
		       return ar2;
		   }

		   public static void display(int[] arr) {
		       for (int i = 0; i < arr.length; i++) {
		           System.out.print(arr[i] + " ");
		       }
		   }

		   public static int CheckSplit(int[] arr) {
		       int leftSum = 0;
		       for (int i = 0; i < arr.length; i++) {
		           leftSum += arr[i];
		           int rightSum = 0;
		           for (int j = i + 1; j < arr.length; j++)
		               rightSum += arr[j];
		           if (leftSum == rightSum)
		               return i;
		       }
		       return -1;
		   }
		}
}
