package assignments;

import java.util.Scanner;

public class dublicate_formatting_recurn {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str=scn.nextLine();

char c='*';
System.out.println(format(str,c));
	}

public static String format(String str,char c) {
	StringBuilder sb= new StringBuilder();
	for(int i=0;i<str.length()-1;i++) {
	char ch= str.charAt(i);
	char c1=str.charAt(i+1);
	
	if(ch==c1) {
		sb.append(ch+ "*"+ c1);
		i++;
	}else {
	
	
		sb.append(ch);
	}
	}
	if(str.charAt(str.length()-1)!=str.charAt(str.length()-2)) {
	sb.append(str.charAt(str.length()-1));
	}
	
	return sb.toString();
}
}
