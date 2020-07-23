package assignments;

import java.util.Scanner;

public class pattern_ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn=new Scanner(System.in);
		 int N=scn.nextInt();
		 int val=1;
		 for(int i=1;i<=N;i++) {
			 for(int j=1;j<=i;j++) {
				 System.out.print(val + "\t");
				 val++;
			 }
			 System.out.println();
		 }
	}

}
