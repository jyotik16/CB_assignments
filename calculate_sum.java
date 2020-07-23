package assignments;

import java.util.Scanner;

public class calculate_sum {
	
		static Scanner scn = new Scanner(System.in);

		public static void main(String[] args) {

			int n = scn.nextInt();
			int[] arr = new int[n];
			int sum=0;
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scn.nextInt();
			}
			int q = scn.nextInt();
			for (int i = 1; i <= q; i++) {
				int x = scn.nextInt();
				int []na=calculate(arr, x);
				arr=na;
			}
			for(int i=0;i<arr.length;i++)
			{
				//System.out.println(arr[i]);
				sum=sum+arr[i];
			}
			System.out.println(sum);
		}
		public static int[] calculate(int []arr,int x)
		{
			int []na=new int[arr.length];
			int j=0;
			for(int i=0;i<arr.length;i++)
			{
				int sum=0;
				if((i-x)<0)
				{
					 j=(i-x)%arr.length+arr.length;
				}
				else
				{
					j=i-x;
				}
				na[i]=arr[i]+arr[j];
				
			}
			return na;
		}
	}


