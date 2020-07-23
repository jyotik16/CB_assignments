package assignments;

import java.util.Scanner;

public class dictionary {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=scn.nextLine();
		String ans=lexicopermu(s,"",false);
		System.out.println(ans);
			}
		public static String lexicopermu(String ques,String ans,boolean islarger) {
			if(ques.length()==0) {
				System.out.println(ans);
				return "";			}
			String res="";
			for(int i=0;i<ques.length();i++) {
				char ch=ques.charAt(i);
				String roq=ques.substring(0,i)+ques.substring(i+1);
				
				if(islarger) {
			res	=lexicopermu(roq,ans+ch,true);
				}else {
					if(ch>ques.charAt(0)) {
			 res=lexicopermu(roq,ans+ch,true);
				}else if(ch<ques.charAt(0)) {
				
				}else {
				res=lexicopermu(roq,ans+ch,false);
				}
			}
			}
			return res;
			}
		}


