package assignments;

import java.util.Scanner;

public class inverse {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int temp=n;
		int count = 1;
		int ans = 0;
		while (temp!= 0) {
			
			int rem = temp % 10;
			ans = ans + (count * (int) Math.pow(10, rem - 1));
			temp= temp / 10;
			count++;
		}System.out.println(ans);
		int inverted=ans;
		//System.out.println(inverted);
		if(n==inverted) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

	

}
 