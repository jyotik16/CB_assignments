package assignments;

import java.util.Scanner;

public class secon_largest {

	
			static Scanner scn = new Scanner(System.in);

			public static void main(String[] args) {

				secon_largest  m = new secon_largest ();
				GenericTree gt = m.new GenericTree();
				gt.findSecondLargest();
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

				public int max() {
					return this.max(this.root);
				}

				private int max(Node node) {
					
				int tm = node.data;
				for (Node child : node.children) {
					int cm = max(child);

					if (cm > tm) {
						tm = cm;
					}
				}

				return tm;
				}

				public void findSecondLargest() {
		           HeapMover hm=new HeapMover();
		           findSecondLargest(this.root,hm);
		           System.out.println(hm.sl);
					
				}

				private void findSecondLargest(Node node, HeapMover rb) {
				    if(node.data>rb.sl&&node.data<rb.max)
				    {
				        rb.sl=node.data;
				    }
				    for(Node child:node.children)
				    {
				        findSecondLargest(child,rb);
				    }
				}

				private class HeapMover {
					int sl=Integer.MIN_VALUE;
					int max=max();
				}

			}

		}

}

}
