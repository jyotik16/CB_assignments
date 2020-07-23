package assignments;

import java.util.Scanner;

public class hourglass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		// int n scn.nextInt();
		int row = (2 * n) + 1;
		int nst = (2 * n) + 1;
		int nsp = 0;
		int val=n;
		
		for (int i = 1; i <= row/2; i++) {
			for(int j=0;j<=nsp;j++) {
				System.out.print(" ");
			}
			for(int k=nst;k<=0;k--) {
				System.out.print(val);
				if(k<k/2) {
					val++;
				}else {
					val--;
				}
			}
	}
	}	
}
