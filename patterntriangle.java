package assignments;

import java.util.Scanner;

public class patterntriangle {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int count=1;
		int row=1;
		int nsp=n-row;
		int nst=1;
		for( row=1;row<=n;row++) {
		count=row;
			for(int csp=1;csp<=nsp;csp++) {
				System.out.print(" ");
			}
			for(int cst=1;cst<=nst;cst++) {
				System.out.print(count);
				if(cst<((nst+1)/2)) {
					count++;
				}else {
					count--;
					

				}
	

				
				
			}
			nsp=nsp-1;
			nst=nst+2;
			System.out.println();
		} 
		
	
}
}
