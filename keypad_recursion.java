package assignments;

import java.util.Scanner;

public class keypad_recursion {

	
	    static Scanner scn= new Scanner(System.in);
	    
	    public static void main(String args[]) {
	       String ques = scn.nextLine();
			String ans = "";
		int res=countkpc(ques, ans);
		System.out.println(res);	
		printkpc(ques, ans);
	        
	       

	    }
	    public static String getCode(char ch) {

			if (ch == '1') {
				return "abc";
			} else if (ch == '2') {
				return "def";
			} else if (ch == '3') {
				return "ghi";
			} else if (ch == '4') {
				return "jklm";
			} else if (ch == '5') {
				return "nop";
			} else if (ch == '6') {
				return "qr";
			} else if (ch == '7') {
				return "stu";
			} else if (ch == '8') {
				return "vw";
			} else if (ch == '9') {
				return "xyz";
			} else if (ch == '0') {
				return "#$";
			} else {
				return "";
			}
	    }
	   public static void printkpc(String ques, String ans) {
			if (ques.length() == 0) {
				System.out.println(ans);
				return;
			}
			char ch = ques.charAt(0);
			String ros = ques.substring(1);
			String temp = getCode(ch);

			for (int i = 0; i < temp.length(); i++) {

				printkpc(ros, ans + temp.substring(i, i + 1));

			}
	   }
			public static int countkpc(String ques, String ans) {
			if (ques.length() == 0) {
		
				return 1;
			}
	         int no=0;
			char ch = ques.charAt(0);
			String ros = ques.substring(1);

			String s = getCode(ch);
			for (int i = 0; i < s.length(); i++) {
				no+=countkpc(ros, ans + s.substring(i, i + 1));
			}
			return no;
		}
			
	}


