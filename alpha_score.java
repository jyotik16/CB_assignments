package assignments;

public class alpha_score {
	public class Alpha_Score {
		static Scanner scn=new Scanner(System.in);
			public static void main(String[] args) {
				int n=scn.nextInt();
				int[]arr=takeinput(n);
				long sum=0;
				for(int i=0;i<arr.length;i++)
				{
					for(int j=i-1;j>=0;j--)
					{
						if(arr[j]<arr[i])
						{
							sum=sum+arr[j];
						}
					}
				}
				int x=(int)(sum%1000000007);
				System.out.println(x);

			}
			public static int[] takeinput(int n) {
				int[] arr = new int[n];
				for (int i = 0; i < arr.length; i++) {
					arr[i] = scn.nextInt();
				}
				return arr;

			}
		}

}
