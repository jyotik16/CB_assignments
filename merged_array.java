package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class merged_array {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = takeinput();
		int[] array2= takeinput1(array1);
	int[] ans=	concat(array1,array2);
	
	for(  int val:ans)
		System.out.println(val);
	}

	public static int[] takeinput() {
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}
	public static int[] takeinput1(int[] array1) {
		int n = array1.length;
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}
	
	public static int[] concat(int[]array1,int[]array2) {
		
		int[] arr3=new int[array1.length+array2.length];
	int[] res=concat(array1,array2);
		
		return res; 
				
		
	}
	}