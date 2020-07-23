package assignments;

import java.util.Scanner;

public class twins {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s=scn.nextLine();
twin(s,0,0);
	}
	public static void twin(String s,int i,int count){
		if(i==s.length()) {
			System.out.println(count);
			return;
		}
		char c1=s.charAt(i);
		for(int j=i+1;j<s.length();j+=2) {
			char c2=s.charAt(j);
			for(int k=i+2;k<s.length();k+=2) {
				char c3=s.charAt(k);
				if(c1==c3&&c1!=c2) {
					count+=1;
				}
			}
		}
		twin(s,i+2,count);
	}
}
