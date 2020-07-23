 package assignments;

import java.util.Scanner;

public class hollow_diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int row = 1;
		int nst=(n/2)+1;  
		int nsp=1;
		for (row = 1; row <= n; row++) {
			
			if(row==1||row==n) {
				nst= (n / 2) + 1;
				for (int cst = 1; cst <= n/2+1; cst++) {

					System.out.print("*" );
				}for (int cst = 1; cst < n/2+1; cst++) {

					System.out.print("*" );
				}
				
		//		System.out.println();
			}
			
			
			else {
					for(int cst=1;cst<nst;cst++) {
						System.out.print("*");
					}int temp=nst;
					if(row<(n/2)+1) {
					temp=temp-1;
					}else {
						temp=temp+1;
					}
					for(int csp=1;csp<=nsp;csp++) {
						System.out.print(" ");
						
					}if(row<(n/2)+1) {
						nsp=nsp+2;
					}else {
						nsp=nsp-2;
		           } 
				
					for(int cst=1;cst<nst;cst++) {
			System.out.print("*");
		}if(row<(n/2)+1) {
			nst=nst-1;
		}else {
			nst=nst+1;
		}
			}System.out.println();
	
	}
}
}
