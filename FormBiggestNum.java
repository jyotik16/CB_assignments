/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicPrograming;
import java.util.Scanner;

public class FormBiggestNum {
static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		int t = scn.nextInt();
		int temp;
		for (int count = 0; count < t; count++) {
			int[] a = takeinput();
			int n = a.length;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n - 1 - i; j++) {
					if (compare(a[j], a[j + 1]) < 0) {
						temp = a[j];
						a[j] = a[j + 1];
						a[j + 1] = temp;
					}
				}
			}
			String ans="";
			for (int i = 0; i < n; i++) {
			     ans = ans +""+a[i];
			 }
			
			System.out.println(ans);
		}

	}


	public static int[]takeinput(){
		int size = scn.nextInt();
		int[] a = new int[size];
		for (int i = 0; i < size; i++) {
			a[i] = scn.nextInt();
		}
		return a;

	}

	public static int compare(int a, int b) {
		String num1 = a + "" + b;
		String num2 = b + "" + a;

		int intnum1 = Integer.valueOf(num1);
		int intnum2 = Integer.valueOf(num2);

		if (intnum1 >= intnum2)
			return 1;

		else
			return -1;

	}

}
