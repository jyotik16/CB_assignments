package assignments;

import java.util.Scanner;

public class sum_of_oddeven_places {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int temp = n;

		int even = 0;
		int odd = 0;
		int i = 0;
		while (temp != 0) {

			i++;
			temp = temp / 10;
		}
		int n2=n;
		
		if (i % 2 == 0) {
           int n1=n2;
			while (n1 != 0) {
				int a = n1 % 10;
				even = even + a;
				n1 = n1 / 10;
				int b = n1 % 10;
				odd = odd + b;
				n1 = n1 / 10;
			}
			System.out.println(even);
			System.out.println(odd); 

		} else {
			 int n1=n2;
			while (n1 != 0) {
			
				int b = n1 % 10;
				odd = odd + b;
				n1 = n1 / 10;
				int a = n1 % 10;
				even = even + a;
				n1 = n1 / 10;
			}
			System.out.println(even);
			System.out.println(odd);
			

		}

	}
}
