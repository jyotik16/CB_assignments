package assignments;

import java.util.Scanner;

public class rotate {

	 static Scanner scn=new Scanner(System.in);
	    public static void main(String args[]) {
	 
		 
		
			int[][] arr= takeinput();
			display(arr);
			}

		 public static int[][] takeinput(){
			 System.out.println("rows ?");
			 int rows=scn.nextInt();
			 int cols=rows;
			 int [][] arr= new int[rows][];
			 
			 for( rows=0;rows<arr.length;rows++) {
			 System.out.println("columns  ?");
				
				 arr[rows]=new int[cols];
				 
				 for(cols=0;cols<arr[rows].length;cols++) {
				 System.out.println("["+ rows + "-"+ cols+"]" +  "?");
					 arr[rows][cols]=scn.nextInt();
				 }
			 }
			 return arr;
			 
			 
		 }
		   public static void display(int[][]arr) {
			   
				   for( int cols=arr.length-1;cols>=0;cols--) {
				       for(int rows=0;rows<=arr[0].length-1; rows++) {
					   System.out.print(arr[rows][cols] + " ");
				   }
				   System.out.println();
			   }
		   }

	}


