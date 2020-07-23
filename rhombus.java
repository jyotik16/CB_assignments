package assignments;

import java.util.Scanner;

public class rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row=1;
		int nst = 1;
		int nsp = n-1;
        int count=1; 
        for(row=1;row<=(2*n)-1;row++) {
        	if(row<=n) {
        	count=row;
        	}else {
        		count=(2*n)-1-row+1;
        	}
        	
		for (int csp = 1; csp <= nsp; csp++) {
			System.out.print(" " + "\t");
		}
		for (int cst = 1; cst <= nst; cst++) {
			System.out.print(count + "\t");
			if(cst<(nst/2)+1) {
				count++;
			}else {
				count--;
			}
		}
		if(row<n) {
			nsp=nsp-1;
			nst=nst+2;
			
		}else {
			nsp=nsp+1;
			nst=nst-2;
			//count=n-row;
		}
		System.out.println();
		
	}
	}
}
