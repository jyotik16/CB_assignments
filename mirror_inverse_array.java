package assignments;

import java.util.Scanner;

public class mirror_inverse_array {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {	
		int[] array = takeinput();
		inverse(array);
		
		
	}
	public static int[] takeinput() {
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
			
		}
		return arr;
	}
	
	public static void inverse(int[]array) {
		int[] na=new int[array.length];
		for(int i=0;i<array.length;i++) {
			
		na[array[i]]=i;
		//System.out.println(array[i]);
	//	System.out.println(na[array[i]]);
	}
		boolean ans=mirror(na,array);
		System.out.println(ans);
	}
	public static boolean mirror(int[] na,int[]array) {
		boolean flag=true;
		
		for(int i=0;i<na.length;i++) {
		if(na[i]!=array[i]) {
			flag = false;
		}
		}
		return flag;
}
}