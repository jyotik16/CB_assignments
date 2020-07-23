package assignments;

import java.util.Scanner;

public class count_aaa {
static Scanner scn= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String str= scn.nextLine();
 String a="aaa";
 countaaa(str,0,-2);
 
 no3a(str,0,0);
	}public static void countaaa(String str,int i,int count) {
	

	if(i==str.length()) {
		System.out.println(count);
		return ;
	}
	char ch='a';
	 char c=str.charAt(i);
	if(c==ch) {
		count=count+1;

		
	}
	countaaa(str,i+1,count);
	

}
	public static void no3a(String str,int i,int count) {
		if(i==str.length()) {
			System.out.println(count/3);
			return ;
		}
		char ch='a';
		 char c=str.charAt(i);
		if(c==ch) {
			count=count+1;

			
		
		
		}
		no3a(str,i+1,count);
}
}