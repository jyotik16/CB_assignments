package assignments;

import java.util.Scanner;

public class revrse_array {

	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {	
		int[] array = takeinput();
		display(array);
	}
	public static int[] takeinput() {
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
		return arr;
	}
	public static void display(int[] array) {
		for(int i=array.length-1;i>=0;i--) {
			System.out.println(array[i]);
		}
	}
}