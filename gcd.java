package assignments;

import java.util.Scanner;

public class gcd {

	public static void main(String[] args) {
	 
		 Scanner scn=new Scanner(System.in);
		 int n1=scn.nextInt();
		 int n2=scn.nextInt();
		 int rem=1; 
		 int a=n1;
		 int b = n2;
		 while(a%b!=0) {
			 rem=a%b;
			 a=b;
			 b=rem;
		 }System.out.println(b);
		   
	
		 
		 
		 
	}

}
