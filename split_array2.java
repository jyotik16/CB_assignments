package assignments;

public class split_array2 {
	public class Split_Array {
	    public static void main(String args[]) {
	     Scanner scn=new Scanner(System.in);
			int n=scn.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=scn.nextInt();
			}
			System.out.println(SplitArraycnt(arr, 0, 0,0, 0));
			SplitArray(arr,0,"",0,"",0);
		}
		
		public static int SplitArraycnt(int[] arr,int idx, int sum1,int sum2,int cnt){
			
			
			if(idx==arr.length) {
				if(sum1==sum2) {
					return +1;
					}
				return 0;
			}
			int cnt1=0,cnt2=0;
			cnt1+=SplitArraycnt(arr, idx+1, sum1+arr[idx], sum2,cnt);
			cnt2+=SplitArraycnt(arr,  idx+1, sum1, sum2+arr[idx],cnt);
			
			return cnt1+cnt2;
		}
		
		
		public static void SplitArray(int[] arr,int idx, String ans1,int sum1,String ans2,int sum2){
		
			
			if(idx==arr.length) {
				if(sum1==sum2) {
					System.out.print(ans1+" and "+ans2);
					System.out.println();
				}
				return;
			}
			
			SplitArray(arr, idx+1,ans1+" "+arr[idx], sum1+arr[idx], ans2, sum2);
			SplitArray(arr,  idx+1,ans1,sum1, ans2+" "+arr[idx], sum2+arr[idx]);
			
		}
	}



}
