package assignments;

import java.util.Scanner;

public class calculator {
	

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	long  a=0;
	long  b=0;
	int f=1;
	do {
		char ch=scn.next().charAt(0);
		
		switch(ch) {
		case'+':
			a=scn.nextInt();
			b=scn.nextInt();
			System.out.println(a+b);
			break;
		case'-':
			a=scn.nextInt();
			b=scn.nextInt();
			System.out.println(a-b);
			break;
		case'*':
			a=scn.nextInt();
			b=scn.nextInt();
			System.out.println(a*b);
			break;
		case'/':
			a=scn.nextInt();
			b=scn.nextInt();
			if(b!=0) {
			System.out.println(a/b);
			}
			break;
		case'%':
			a=scn.nextInt();
			b=scn.nextInt();
			if(b!=0) {
			System.out.println(a%b);
			}
			break;
		case'X':
			f=0;
			break;
		case'x':
			f=0;
			break;
			default:
				System.out.println("Invalid operation.Try again");
				f=1;
		}
	}while(f==1);
	
	}
}