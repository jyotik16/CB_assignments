package assignments;

public class delete_from_linkedlist {
	public class LinkedList {

		private class Node {
			int data;
			Node next;
		}

		private Node head;
		private Node tail;
		private int size;

		public int size() {
			return this.size;
		}

		public int getFirst() throws Exception {

			if (this.size == 0) {
				throw new Exception("LL is Empty.");
			}

			return this.head.data;

		}

		public int getLast() throws Exception {

			if (this.size == 0) {
				throw new Exception("LL is Empty.");
			}

			return this.tail.data;

		}

		public int getAt(int idx) throws Exception {

			if (this.size == 0) {
				throw new Exception("LL is Empty.");
			}

			if (idx < 0 || idx >= this.size) {
				throw new Exception("Invalid Index.");
			}

			Node temp = this.head;

			for (int i = 1; i <= idx; i++) {
				temp = temp.next;
			}

			return temp.data;

		}

		private Node getNodeAt(int idx) throws Exception {

			if (this.size == 0) {
				throw new Exception("LL is Empty.");
			}

			if (idx < 0 || idx >= this.size) {
				throw new Exception("Invalid Index.");
			}

			Node temp = this.head;

			for (int i = 1; i <= idx; i++) {
				temp = temp.next;
			}

			return temp;

		}

		public void addLast(int item) {

			// create
			Node nn = new Node();
			nn.data = item;
			nn.next = null;

			// attach
			if (this.size > 0)
				this.tail.next = nn;

			// dm update
			if (this.size == 0) {
				this.head = nn;
				this.tail = nn;
				this.size += 1;
			} else {
				this.tail = nn;
				this.size += 1;
			}

		}

		public void addFirst(int item) {

			// create
			Node nn = new Node();
			nn.data = item;
			nn.next = null;

			// attach
			nn.next = this.head;

			// dm update
			if (this.size == 0) {
				this.head = nn;
				this.tail = nn;
				this.size++;
			} else {
				this.head = nn;
				this.size++;
			}

		}

		public void addAt(int item, int idx) throws Exception {

			if (idx < 0 || idx > this.size) {
				throw new Exception("Invalid Index.");
			}

			if (idx == 0) {
				addFirst(item);
			} else if (idx == this.size) {
				addLast(item);
			} else {

				// create
				Node nn = new Node();
				nn.data = item;
				nn.next = null;

				// attach
				Node nm1 = getNodeAt(idx - 1);
				Node np1 = nm1.next;

				nm1.next = nn;
				nn.next = np1;

				// dm
				this.size++;
			}

		}

		public int removeFirst() throws Exception {

			if (this.size == 0) {
				throw new Exception("LL is empty.");
			}

			Node temp = this.head;

			if (this.size == 1) {
				this.head = null;
				this.tail = null;
				this.size = 0;
			} else {
				this.head = this.head.next;
				this.size--;
			}
			return temp.data;
		}

		public int removeLast() throws Exception {

			if (this.size == 0) {
				throw new Exception("LL is empty.");
			}

			Node temp = this.tail;

			if (this.size == 1) {
				this.head = null;
				this.tail = null;
				this.size = 0;
			} else {
				Node sm2 = getNodeAt(this.size - 2);
				sm2.next = null;
				this.tail = sm2;
				this.size--;
			}
			return temp.data;
		}

		public int removeAt(int idx) throws Exception {

			if (this.size == 0) {
				throw new Exception("LL is empty.");
			}

			if (idx < 0 || idx >= this.size) {
				throw new Exception("Invalid Index.");
			}

			if (idx == 0) {
				return removeFirst();
			} else if (idx == this.size - 1) {
				return removeLast();

			} else {

				Node nm1 = getNodeAt(idx - 1);
				Node n = nm1.next;
				Node np1 = n.next;

				nm1.next = np1;
				this.size--;

				return n.data;

			}

		}

		public void display() {

			Node temp = this.head;

			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}

		}

		public boolean isPalindrome() throws Exception {
			Node left = this.head;
			int idx = this.size - 1;
			Node right = this.getNodeAt(idx);
			while (left != right && left.next != right) {
				if (left.data == right.data) {
					left = left.next;
					idx--;
					right = getNodeAt(idx);
				} else {
					return false;
				}
			}
			if (left.data == right.data)
				return true;
			else
				return false;
		}

//		public void LLOddEven(LinkedList helper) {
//			Node left = this.head;
//			if (left.data % 2 == 0) {
//				helper.addLast(left.data);
//				left = left.next;
//			}
//			while (left != null) {
//				if (left.data % 2 == 0) {
//					helper.addLast(left.data);
//					left.next = left.next.next;
//				} else {
//					left = left.next;
//				}
//			}
//			Node temp = helper.head;
//			while (temp != null) {
//				this.addLast(temp.data);
//				temp = temp.next;
//			}
	//
//		}

		public void kappend(int k) throws Exception {
//			int idx = Math.abs((this.size - k-1) % this.size);
			for (int i = 0; i < k; i++) {
				this.addFirst(this.removeLast());
			}
		}

//		public void kReverse(int k, int idx) throws Exception {
//			if (idx == k) {
//				return;
//			}
//			int s=this.size / k;
//			for (int i = 1; i <= s; i++) {
//				int temp = this.removeFirst();
//				kReverse(k, idx + 1);
//				this.addLast(temp);
//				if (idx != 0) {
//					return;
//				}
//				this.tail.next=null;
//			}
//		}

		public void kReverse(int k) throws Exception {

			LinkedList prev = null;

			while (this.size != 0) {

				LinkedList curr = new LinkedList();
				for (int i = 1; i <= k; i++) {
					curr.addFirst(this.removeFirst());
				}

				if (prev == null) {
					prev = curr;
				} else {
					prev.tail.next = curr.head;
					prev.tail = curr.tail;
					prev.size += curr.size;
				}
			}

			this.head = prev.head;
			this.tail = prev.tail;
			this.size = prev.size;

		}

		public int kthFromLast(int k) {

			Node slow = this.head;
			Node fast = this.head;

			for (int i = 1; i <= k; i++) {
				fast = fast.next;
			}

			while (fast != null) {
				slow = slow.next;
				fast = fast.next;
			}

			return slow.data;

		}


		public static void main(String[] args) throws Exception {
			Scanner scn = new Scanner(System.in);
	LinkedList list = new LinkedList();
			int n = scn.nextInt();
			int q = scn.nextInt();
			for (int i = 0; i < n; i++) {
				list.addLast(scn.nextInt());
			}
			for (int i = 1; i <= q; i++) {
	          int idx=scn.nextInt();
	          list.removeAt(idx);
	          list.display();
	          System.out.println();
			}
		}

		public static LinkedList mergeTwoSortedLL(LinkedList first, LinkedList second) {

			LinkedList merged = new LinkedList();

			Node temp1 = first.head;
			Node temp2 = second.head;

			while (temp1 != null && temp2 != null) {

				if (temp1.data < temp2.data) {
					merged.addLast(temp1.data);
					temp1 = temp1.next;
				} else {
					merged.addLast(temp2.data);
					temp2 = temp2.next;
				}
			}

			if (temp1 == null) {

				while (temp2 != null) {
					merged.addLast(temp2.data);
					temp2 = temp2.next;
				}
			}

			if (temp2 == null) {

				while (temp1 != null) {
					merged.addLast(temp1.data);
					temp1 = temp1.next;
				}
			}

			return merged;
		}
	}

}
