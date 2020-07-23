package assignments;

import java.util.Scanner;

public class Nth_triangle {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		int n=scn.nextInt();
		triangles(n,sum,1);
	}
	public static void triangles(int n,int sum,int val) {
		if(val>n) {
			System.out.println(sum);
			return;
		}
		sum=sum+val;
	//	System.out.println(sum);
		triangles(n,sum,val+1);
		
	}

}
