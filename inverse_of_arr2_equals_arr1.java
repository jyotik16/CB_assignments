package assignments;

import java.util.Scanner;

public class inverse_of_arr2_equals_arr1 {

	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {	
		int[] array1 = takeinput();
		int[] array2= takeinput1(array1);
	int[] na  =	inverse(array2);
		compare(array1,na);
	}
	public static int[] takeinput() {
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
			
		}
		return arr;
}
	public static int[] takeinput1(int[]array1) {
		
		int[] arr=new int[array1.length];
		for(int i=0;i<array1.length;i++) {
			arr[i]=scn.nextInt();
			
		}
		return arr;
}
	public static int[] inverse(int[] array2) {
		int[] arr= new int[array2.length];
		for(int i=0;i<array2.length;i++) {
			arr[array2[i]]=i;
		}
		return arr;
	}
	public static void compare(int[] array2,int[] na) {
		int f=0;
		for(int i=0;i<array2.length;i++) {
			if(na[i]==array2[i]) {
				i++;
				f=1;
			}else {
				System.out.println("false");
				break;
			}
		}
		if(f==1) {
			System.out.println("true");
		}
	}
}