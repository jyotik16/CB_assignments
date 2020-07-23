package assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class structually_identical {
	Scanner scn = new Scanner(System.in) ;
	
	public static void main(String[] args) {

		Main m = new Main();
		GenericTree gt1 = m.new GenericTree();
		GenericTree gt2 = m.new GenericTree();

		System.out.println(gt1.structurallyIdentical(gt2));

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

		public boolean structurallyIdentical(GenericTree other) {
			return this.structurallyIdentical(this.root, other.root);
		}

		private boolean structurallyIdentical(Node tnode, Node onode) {
			if (tnode.data != onode.data) {
				return false;
			}
			if (tnode.children.size() != onode.children.size()) {
				return false;
			}
			for (int i = 0; i < tnode.children.size(); i++) {
				boolean val = structurallyIdentical(tnode.children.get(i), onode.children.get(i));
				if (val == false) {
					return false;
				}
			}
			return true;
		}


	}

}

}
