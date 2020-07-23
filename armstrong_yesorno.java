package assignments;

import java.util.Scanner;

public class armstrong_yesorno {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num=scn.nextInt();
	int num1=num;
		
		int j = 0;
		while (num1 != 0) {
            
			num1 = num1 / 10;
			j++;
		
		}
		
	
		int ans = 0;
	int onum = num;
		while (num != 0) {
			int rem = num % 10;

			ans = ans + (int) Math.pow(rem, j);
			num = num / 10;

		}
	if (ans == onum) {
			System.out.println("true");
	} else {
		System.out.println("false"); 
	}
		
		}

}
