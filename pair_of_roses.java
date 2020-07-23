package assignments;
import java.util.Scanner;

public class pair_of_roses {
	

	
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

		int test = scn.nextInt();

		for (int i = 0; i < test; i++) {

			int n = scn.nextInt();

			int[] A = new int[n];

			for (int j = 0; j < A.length; j++) {
				A[j] = scn.nextInt();
			}
			
			int target = scn.nextInt();
			int a = 0, b = 0;

			bubblesort(A);
			int min = Integer.MAX_VALUE;
			for (int j = 0; j < A.length; j++) {
				for (int k = j; k < A.length; k++) {
					int diff = A[j] - A[k];
					diff = Math.abs(diff);
					if ((A[j] + A[k] == target) && (diff < min)) {
						if (A[j] < A[k]) {
							a = A[j];
							b =A[k];
						} else {
							a = A[k];
							b = A[j];
						}
					}

				}
			}
			System.out.println("Deepak should buy roses whose prices are " + a + " and " + b + ".");
System.out.println();
		}

	}
	public static int[] bubblesort(int[] A) {
		for (int i = 0; i < A.length - 1; i++) {
			for (int j = 0; j < A.length - i - 1; j++) {
				if (A[j + 1] < A[j]) {
					int temp = A[j];
					A[j] = A[j + 1];
					A[j + 1] = temp;
				}
			}
		}
		return A;

	}

}

