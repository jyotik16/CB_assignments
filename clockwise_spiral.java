package assignments;

import java.util.Scanner;

public class clockwise_spiral {

	static Scanner scn =new Scanner(System.in);
    public static void main(String[] arg) {
 int[][] arr=takeinput();
 display(arr);
    }
    public static void display(int[][]arr){
        int minrow=0;
        int maxrow=arr.length-1;
        int mincol=0;
        int maxcol=arr.length-1;
        int counter=0;
        int nod=arr.length*arr[0].length;
        while(counter<nod){
            for(int col=mincol;counter<nod&&col<=maxcol;col++){
                System.out.print(arr[minrow][col] + ", ");
                counter++;
            }minrow++;
             for(int row=minrow;counter<nod&&row<=maxrow;row++){
                System.out.print(arr[row][maxcol] + ", ");
                counter++;
            }maxcol--;
             for(int col=maxcol;counter<nod&&col>=mincol;col--){
            System.out.print(arr[maxrow][col] + ", ");
                counter++;
            }maxrow--;
             for(int row=maxrow;counter<nod && row>=minrow;row--){
                System.out.print(arr[row][mincol] +  ", ");
                counter++;
            }mincol++;
        }
        System.out.print("END");
    }
    public static int[][] takeinput(){
        int row=scn.nextInt();
        int col=scn.nextInt();
        int[][] arr=new int[row][];
        for(row=0;row<arr.length;row++){
            arr[row]=new int[col];
            for(col=0;col<arr.length;col++){
                arr[row][col]=scn.nextInt();
            }
        }
        return arr;
            }
    

}
