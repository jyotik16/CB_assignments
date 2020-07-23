package assignments;

import java.util.Scanner;

public class pattern_with_zero {

	public static void main(String[] args) {
	
		Scanner scn =new Scanner(System.in);
		int n=scn.nextInt();
		int nst=1;
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=nst;j++) {
				
				if((j==1)||(j==nst)) {
				
			
				System.out.print(i);
				System.out.print("\t");
			}
				else {
					System.out.print("0");
					System.out.print("\t");
				}
			}
			nst++;
			System.out.println();
		}
	}
}
