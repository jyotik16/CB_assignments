package assignments;

import java.util.Scanner;

public class lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int n2=scn.nextInt();
		 int a=n1;
		 int b = n2;;
		 int	 rem=0;
		 while(a%b!=0) {
			 rem=a%b;
			 a=b;
			 b=rem;
		 } 
		//System.out.println(b);
		
		
		int lcm=(n1*n2)/b;
		System.out.println(lcm);
	}

}
