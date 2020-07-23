package assignments;

import java.util.Scanner;

public class temperature {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int minF=scn.nextInt();
		int maxF=scn.nextInt();
          int step=scn.nextInt();
          for( int F=minF;F<=maxF;F+=step) {
        	  int C= (int)((5.0/9)*(F-32));
        	  System.out.println(F + "\t"+ C);
          }
	}

}
