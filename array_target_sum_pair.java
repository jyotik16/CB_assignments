package assignments;

import java.util.Scanner;

public class array_target_sum_pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();

		}

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		int target = scn.nextInt();
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
              for(int k=j+1;k<arr.length;k++) {
				sum = arr[i] + arr[j] +  arr[k];

				if (target == sum) {
				
						System.out.println(arr[i] + " , " + arr[j] +  " and " + arr[k]);
								}
				}
			}
		}
		}
	}

