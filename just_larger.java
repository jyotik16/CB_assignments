package assignments;

import java.util.Scanner;

public class just_larger {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		Main m = new Main();
		GenericTree gt = m.new GenericTree();
		int data = scn.nextInt();
		gt.findJustLarger(data);
	}

	private class GenericTree {
		private class Node {
			int data;
			ArrayList<Node> children = new ArrayList<>();
		}

		private Node root;

		public GenericTree() {
			this.root = this.takeInput(scn, null, -1);
		}

		private Node takeInput(Scanner scn, Node parent, int i) {

			int childData = scn.nextInt();

			int numGC = scn.nextInt();

			Node child = new Node();
			child.data = childData;

			for (int j = 0; j < numGC; j++) {
				Node gc = this.takeInput(scn, child, j);
				child.children.add(gc);
			}

			return child;
		}

		public void findJustLarger(int data) {
			HeapMover hm = new HeapMover();
			this.findJustLarger(this.root, hm, data);

			System.out.println(hm.justLarger == null ? "-1" : hm.justLarger.data);
		}

		private void findJustLarger(Node node, HeapMover rb, int data) {

		if(node.data>data)
		{
		    if(rb.justLarger==null||node.data<rb.justLarger.data)
		    {
		        rb.justLarger=node;
		    }
		}
		for(Node child:node.children)
		{
		    findJustLarger(child,rb,data);
		}
			
		}

		private class HeapMover {
			Node justLarger = null;

		}

	}

}

}
