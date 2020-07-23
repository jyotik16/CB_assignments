package assignments;

import java.util.Scanner;

public class octal_to_binary {

	public static void main(String[] args) {
		 Scanner scn=new Scanner(System.in);
		 System.out.println("enter source no");
		 int n=scn.nextInt();
		
		 int ans=0;
		 int ans2=0;
		 int rem=0;
		 int rem2=0;
		 int multiple=1;
		 int multiple2=1;
		 
		 while(n!=0) {
			 rem=n%10;
			 ans=ans+rem*multiple;
			 multiple=multiple*8;
			 n=n/10;
		 }
		 while(ans!=0) {
			 rem2=ans%2;
			 ans2= ans2+rem2*multiple2;
			 multiple2 =multiple2*10;
			 ans=ans/2;
		 }
		 System.out.println(ans2);
		
	}

}
