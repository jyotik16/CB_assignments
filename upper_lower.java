package assignments;

public class upper_lower {
	public class Upper_And_Lower_Bound {
		static Scanner scn = new Scanner(System.in);

		public static void main(String[] args) {
			int n = scn.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scn.nextInt();
			}
			int t = scn.nextInt();
			for (int i = 0; i < t; i++) {
				int item = scn.nextInt();
				System.out.print(lower_index(arr, 0, item)+" ");
				System.out.print(Upper_index(arr, 0, item));
				System.out.println();
			}

		}

		public static int lower_index(int[] arr, int idx, int item) {
			if(idx==arr.length)
			{
				return -1;
			}
			if (arr[idx] == item) {
	           return idx;
			}
			 return  lower_index(arr, idx + 1,item);
		}
	   public static int Upper_index(int []arr,int idx,int item)
	   {
		   if(idx==arr.length)
		   {
			   return -1;
		   }
		   int rv=Upper_index(arr, idx+1, item);
		   if(arr[idx]==item&&rv==-1)
		   {
			   return idx;
		   }
		   return rv;
	   }
	}

}
