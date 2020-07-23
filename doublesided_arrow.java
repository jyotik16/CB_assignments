package assignments;

import java.util.Scanner;


public class doublesided_arrow{
    public static void main(String args[]) {
	Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		if(n%2==0) {
			return;
		}else {
		int nsp1 = n - 1;
		int nsp2 = 0;
		int nst = 1;
		int row = 1;
		int val = 1;

		for(row=1;row<=n;row++) {
			if(row==1||row==n) {
				val=1;
				nsp1=n-1;
				nst=1;
				for(int csp=1;csp<=nsp1;csp++) {
					System.out.print(" " + " ");
				}
				for(int cst=1;cst<=nst;cst++) {
					System.out.print(val + " ");	
			}
			}else {
				if(row<=n/2+1) {
					val=row;
					nsp1-=2;
					nst+=1;
					nsp2+=2;
				}else {
					val=n-row+1;
					nsp1+=2;
					nst-=1;
					nsp2-=2;
				}
			for(int csp=1;csp<=nsp1;csp++) {
				System.out.print(" " + " ");
			}int temp=val;
			for(int cst=1;cst<=nst;cst++) {
				System.out.print(temp + " ");
				
				temp--;
			}
			for(int csp=1;csp<nsp2;csp++) {
				System.out.print(" "+  " ");
			}val=1;
			for(int cst=1;cst<=nst;cst++) {
				System.out.print(val+" ");
				val++;
			}
		//	row++;
			
			}
		
			System.out.println();
		}
    }
}
}
