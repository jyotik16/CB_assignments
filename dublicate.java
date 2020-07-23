package assignments;

import java.util.Scanner;

public class dublicate {
    public static void main(String args[]) {
        
        Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		System.out.println(removeD(str));
    }
    	public static String removeD(String str) {
		StringBuilder sb = new StringBuilder(str);
		for (int i = 0; i < sb.length() - 1; i++) {
			if(sb.charAt(i)==sb.charAt(i+1)) {
				sb.delete(i, i+1);
				i--;
			}
		}
		String bar = sb.toString();
		return bar;
    }
}