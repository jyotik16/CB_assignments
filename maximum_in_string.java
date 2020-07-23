package assignments;

import java.util.Scanner;

public class maximum_in_string {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = scn.nextLine();
		max(s);
	}

	public static void max(String s) {
		
		int max = 0;
		char ch;
		char ch1;
		char ans=' ';
		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			int temp = 1;
			for (int j = i+1 ; j < s.length(); j++) {
				ch1=s.charAt(j);
			if (ch == ch1) {

					temp++;
					
				}if(max<temp) {
					max=temp;
					ans=s.charAt(i);
				}
			}

		}
		System.out.println(ans);
		

	}

}