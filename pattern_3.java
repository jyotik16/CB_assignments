package assignments;

import java.util.Scanner;

public class pattern_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
	
		int row=1;
		int nsp=(n/2)+1;
		int nst=1;
		for( row=1;row<=n;row++) {
		   for(int csp=1;csp<=nsp;csp++) {
			  
			   System.out.print(" " + "\t");
		   }
			for(int cst=1;cst<=nst;cst++) {
				
				System.out.print("*" + "\t");
			}
			if(row<(n/2)+1) {
		nsp=nsp-1;
		nst=nst+2;
			}else {
				nsp=nsp+1;
				nst=nst-2;	
			}
			System.out.println();
		} 
		
		


	}

}
