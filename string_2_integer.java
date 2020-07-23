package assignments;

import java.util.Scanner;

public class string_2_integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
String  str= scn.nextLine();
convert(str);
	}
	public static void convert(String str) {
		StringBuilder sb=new StringBuilder();
		int c='0';
		for(int i=0;i<str.length();i++) {
			
		
		char s=str.charAt(i);
		
		
		int d=(int)s-c;
				
		sb.append(d);
		
	}
		System.out.print(sb);
	}
}
