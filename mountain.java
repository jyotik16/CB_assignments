package assignments;

import java.util.Scanner;

public class mountain {

	
		
		    public static void main(String args[]) {
			Scanner scn = new Scanner(System.in);
				int n = scn.nextInt();
				int row=1;
				int nst=1;
				int nsp=n+1;
				for(row=1;row<=n;row++) {
					int val=1;
					for(int cst=1;cst<=nst;cst++) {
						System.out.print(val + "\t");
						val++;
					}
					for(int csp=1;csp<=nsp;csp++) {
						System.out.print(" " + "\t");
					}
					if(row==n) {
						val=n-1;
						for(int cst=nst-1;cst>=1;cst--) {
						System.out.print(val + "\t");
						val--;
						}
					}else {
						val=val-1;
					for(int cst=nst;cst>=1;cst--) {
						System.out.print(val + "\t");
						val--;
					}
				}
					nst=nst+1;
					nsp=nsp-2;
					System.out.println();
			}
		    }
		}
	

