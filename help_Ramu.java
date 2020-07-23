package assignments;

public class help_Ramu {
	public class HelpRamu {
		static Scanner scn = new Scanner(System.in);

		public static void main(String[] args) {
			int t = scn.nextInt();
			for (int i = 1; i <= t; i++) {
				int c1 = scn.nextInt();
				int c2 = scn.nextInt();
				int c3 = scn.nextInt();
				int c4 = scn.nextInt();
				int rick = scn.nextInt();
				int cabs = scn.nextInt();
				int[] nor = new int[rick];
				for (int x = 0; x < nor.length; x++) {
					nor[x] = scn.nextInt();
				}
				int[] noc = new int[cabs];
				for (int x = 0; x < noc.length; x++) {
					noc[x] = scn.nextInt();
				}
				int rickshawcost = 0;
				for (int x = 0; x < nor.length; x++) {
					rickshawcost += Math.min(c1 * nor[x], c2);
				}
				rickshawcost = Math.min(rickshawcost, c3);
				int cabcost = 0;
				for (int x = 0; x < noc.length; x++) {
					cabcost += Math.min(c1 * noc[x], c2);
				}
				cabcost = Math.min(cabcost, c3);
				int finalcost = Math.min(rickshawcost + cabcost, c4);
				System.out.println(finalcost);
			}

		}
	}

}
