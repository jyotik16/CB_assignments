package assignments;

public class help_rahul_toSearch {
	public class help_Rahul_to_search {
		static Scanner scn = new Scanner(System.in);

		public static void main(String[] args) {
			int n = scn.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scn.nextInt();
			}
	        int item=scn.nextInt();
	        for(int i=0;i<arr.length;i++)
	        {
	        	if(arr[i]==item)
	        	{
	        		System.out.println(i);
	        		break;
	        	}
	        }
		}

	}

}
