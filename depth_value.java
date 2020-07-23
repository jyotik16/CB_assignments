package assignments;

	
import java.util.ArrayList;
import java.util.Scanner;


	public class depth_value {

		static Scanner scn = new Scanner(System.in);

		public static void main(String[] args) {

			Main m = new 
ain();
			GenericTree gt = m.new GenericTree();
			gt.replaceWithDepth();
			gt.display();
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

			public void display() {
				this.display(this.root);
			}

			private void display(Node node) {
				// work
				String str = node.data + " => ";
				for (Node child : node.children) {
					str += child.data + ", ";
				}
				System.out.println(str + "END");

				// delegate
				for (Node child : node.children) {
					this.display(child);
				}
			}

			public void replaceWithDepth() {
				this.replaceWithDepth(this.root, 0);
			}

			private void replaceWithDepth(Node node, int d) {
	              node.data=d;
	              for(Node chid:node.children){
			          replaceWithDepth(chid,d+1);
			   }

			}
		}

	}


