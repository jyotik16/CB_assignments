package assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class maze_path {
 static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int n=scn.nextInt();
//int m=scn.nextInt();
maze(1,1,3,3,0);
	}
	public static void mazepath(int cr,int cc,int er,int ec,String ans,int count) {
		count++;
		if(cr==ec&&cc==ec) {
			System.out.println(count);
			System.out.print(ans);
			return;
		}
		if(cr>er||cc>ec) {
			return;
		}
		
		
		mazepath(cr,cc+1,er,ec,ans+"H",count);
		
		mazepath(cr+1,cc,er,ec,ans+"V",count);
		
	}
	public static ArrayList<String> maze(int cr, int cc, int ec,int er,int count ) {
		if(cr==er&&cc==ec) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		if(cc>ec||cr>er) {
			ArrayList<String> br = new ArrayList<>();
			
			return br;
		}
		ArrayList<String> mr = new ArrayList<>();
		ArrayList<String> rrh = maze(cr,cc+1,ec,er);
		for (String rrs : rrh) {
			mr.add("H"+ rrs);
			count++;
		}
		ArrayList<String> rrv = maze(cr+1,cc,ec,er);
		for (String rrs : rrv) {
			mr.add("V"+ rrs);
			count++;
		}
		return mr;
	}
}
