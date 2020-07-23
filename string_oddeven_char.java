package assignments;

import java.util.Scanner;

public class string_oddeven_char {
  static Scanner scn= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String str= scn.nextLine();
  String s=position(str);
  System.out.print(s);
	}
	public static String position(String str) {
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			int diff='c'-'b';
		char ch=str.charAt(i);
		if(i%2==0) {
			sb.append((char)(ch+diff));
			}else {
				sb.append((char)(ch-diff));
			}
		}
		return sb.toString();
	}

}
