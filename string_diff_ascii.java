package assignments;

import java.util.Scanner;

public class string_diff_ascii {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String s= scn.nextLine();
  diff(s);
  //System.out.println(str);
	}

	public static void diff(String s) {
StringBuilder sb= new StringBuilder();
char c=s.charAt(0);
char n=s.charAt(s.length()-1);
	for(int i=1;i<s.length();i++) {
	
	char c2=s.charAt(i);
	int d=(int)c2-(int)c;
	//System.out.println(d);
	sb.append(((char)c)+"" +((int) d));
	c=c2;
	}
	sb.append(n);
	System.out.println(sb);
	}
}