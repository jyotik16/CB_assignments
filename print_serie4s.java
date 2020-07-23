package assignments;

import java.util.Scanner;

public class print_serie4s {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		int p = 0;
		int value=0;
		
		for (int n = 1; n <=n1+ value; n++) {
			p = (3 * n) + 2;
		
		if (p % n2 != 0) {
			System.out.println(p);	} 
		else if (p%n2==0)
		{ value++; }
		}
	}
}
