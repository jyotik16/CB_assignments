package assignments;

import java.util.Scanner;

public class no_of_times_a_digit {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a=scn.nextInt();
		int temp=n;
		int rem;
		int f=0;
		while(temp!=0) {
			 rem=temp%10;
			temp=temp/10;
			if(rem==a) {
				f++;
			}
		}
		System.out.println(f);
	}

}































































































































































































































































































































