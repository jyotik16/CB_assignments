package assignments;

public class nextGreaterElement_usingStack {
	public class Stack {
		static Scanner scn = new Scanner(System.in);
		protected int[] data;
		private int tos;

		public Stack() {
			this.data = new int[5];
			this.tos = -1;
		}

		public Stack(int n) {
			this.tos = -1;
		}

		public int size() {
			// System.out.println(this.tos+1);
			return this.tos + 1;
		}

		public boolean isEmpty() {
			if (this.size() == 0)
				return true;
			else
				return false;
		}

		public void push(int item) throws Exception {
			if (this.size() == this.data.length) {
				int[] oa = this.data;
				int[] na = new int[2 * oa.length];

				for (int i = 0; i < oa.length; i++) {
					na[i] = oa[i];
				}
				this.data = na;
			}
			this.tos++;
			this.data[this.tos] = item;
		}

		public int pop() throws Exception {
			if (this.size() == 0) {
				throw new Exception("Stack is Empty");
			}
			int rv = this.data[this.tos];
			this.data[this.tos] = 0;
			this.tos--;
			return rv;
		}

		// peek() shows the current value to which our tos is pointing.
		public int peek() throws Exception {
			if (this.size() == 0) {
				throw new Exception("Stack is Empty");
			}
			int rv = this.data[this.tos];
			return rv;
		}

		public void display() {
			
			for (int i = this.tos; i >= 0; i--) {
				System.out.println(this.data[i] + " ");
			}
			// System.out.println("");
			
		}

		public static void main(String[] args) throws Exception {
			Stack stack = new Stack();
			int t=scn.nextInt();
			for(int i=1;i<=t;i++)
			{
			    int N=scn.nextInt();
			    int []arr=new int[N];
			    for(int x=0;x<arr.length;x++)
			    {
			        arr[x]=scn.nextInt();
			    }
			    nextGreaterElement(arr);
			}

		}

		public static void nextGreaterElement(int[] arr) throws Exception {
			Stack s = new Stack();
			for (int i = 0; i < arr.length; i++) {
				while (!s.isEmpty() && arr[i] > s.peek()) {
					System.out.println(s.pop() + "," + arr[i]);
				}
				s.push(arr[i]);
			}
			while (!s.isEmpty()) {
				System.out.println(s.pop() + "," + "-1");
			}
		}
	}

}
