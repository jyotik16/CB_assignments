package assignments;

import java.util.Scanner;

public class print_primes {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		int n=scn.nextInt();
		int count=0;
		int a;

			for( a=2;a<n;a++) {
				if(n%a==0) {
					count=0;
				}else {
					count=1;
				}
			}
			if(count==1) {
				System.out.println(a);
			}
		}
		
	


}