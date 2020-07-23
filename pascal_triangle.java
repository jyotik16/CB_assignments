package assignments;

public class pascal_triangle {
	public class Pascal_Triangle {
		public static void main(String[] args) {
			Scanner scn=new Scanner(System.in);
			int n=scn.nextInt();
		   for(int i=0;i<n;i++) {
			   for(int c=0;c<=i;c++) {
				   System.out.print(factorial(i)/(factorial(c)*factorial(i-c))+" ");
			   }
			   System.out.println();
		   }
		}
		public static int factorial(int x) {
			int result=1;
			for(int c=1;c<=x;c++)
			{
				result=result*c;
			}
			return result;
			
		}
		}

}
