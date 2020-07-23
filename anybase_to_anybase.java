package assignments;

import java.util.Scanner;

public class anybase_to_anybase {

	public static void main(String[] args) {
		 Scanner scn=new Scanner(System.in);
		 //System.out.println("enter source no");
		 int sn=scn.nextInt();
		 //System.out.println("enter source base");
		 int sbe=scn.nextInt();
		 //System.out.println("enter destination base");
		 int db=scn.nextInt();
		 int ans=0;
		 int ans2=0;
		 int rem=0;
		 int rem2=0;
		 int multiple=1;
		 int multiple2=1;
		 
		 
		 while(sn!=0) {
			 rem=sn%10;
			 ans=ans+rem*multiple;
			 multiple=multiple*sbe;
			 sn=sn/10;
		 }
		 while(ans!=0) {
			 rem2=ans%db;
			 ans2= ans2+rem2*multiple2;
			 multiple2 =multiple2*10;
			 ans=ans/db;
		 }
		 System.out.println(ans2);
		 
	}

}
