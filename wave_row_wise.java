package assignments;

import java.util.Scanner;

public class wave_row_wise {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] arr = takeinput();
		display(arr);
	}

	public static int[][] takeinput() {
		//System.out.println("rows ?");
		int rows = scn.nextInt();
		int cols = scn.nextInt();
		int[][] arr = new int[rows][];

		for (rows = 0; rows < arr.length; rows++) {
		//	System.out.println("columns  ?");
			
			arr[rows] = new int[cols];

			for (cols = 0; cols < arr[rows].length; cols++) {
			//	System.out.println("[" + rows + "-" + cols + "]" + "?");
				arr[rows][cols] = scn.nextInt();
			}
		}
		return arr;

	}

	public static void display(int[][] arr) {
	for(int i=0;i<arr.length;i++) {
		if(i%2==0) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j] + ", ");
			}
		}else {
			for(int j=arr[0].length-1;j>=0;j--) {
				System.out.print(arr[i][j] + ", ");
			}
		}
	}
	System.out.print("END");
	}
}
