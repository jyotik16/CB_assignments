package assignments;

public class codes_ofThe_string {
	public class Main {
		   public static void main(String args[]) {
		       // Your Code Here
		       Scanner scn=new Scanner(System.in);
		       String s=scn.nextLine();
		       
		       System.out.println(printCodes(s,""));
		   }
		    public static ArrayList<String> printCodes(String str, String ans) {
		        if (str.length() == 0) {
		            ArrayList<String> br = new ArrayList<>();
		            br.add(ans);
		            return br;

		        }

		        char ch1 = str.charAt(0);
		        char code1 = (char) (ch1 - '1' + 'a');
		        ArrayList<String> rr = new ArrayList<>();
		        ArrayList<String> mr = printCodes(str.substring(1), ans + code1);
		        for (String rrs : mr) {
		            rr.add(rrs);
		        }

		        if (str.length() >= 2 && ch1 <= '2') {
		            int i = Integer.parseInt(str.substring(0, 2), 10);
		            if (i > 0 && i <= 26) {
		                char code2 = (char) (i + 'a' - 1);
		                ArrayList<String> rs = printCodes(str.substring(2), ans + code2);
		                for(String rrs:rs) {
		                    rr.add(rrs);
		                }
		            }
		        }
		        return rr;
		    }
		}
}
