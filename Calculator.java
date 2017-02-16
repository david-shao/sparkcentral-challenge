import java.util.Scanner;

public class Calculator {
	private Node root;

	public Calculator(String input) {
		try {
			Scanner scan = new Scanner(input);
			while (scan.hasNext()) {
				String i = scan.next();
				try {
					int v = Integer.parseInt(i);
					Node node = NodeFactory.getInstance().createNode(v);
					this.addNode(node);
				}
				catch (NumberFormatException e) {
					char c = i.charAt(0);
					Node node = NodeFactory.getInstance().createNode(c);
					this.addNode(node);
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public double getResult() {
		return root.calculate();
	}

	private void addNode(Node n) {
		//base case, adding first integer
		if (this.root == null) {
			this.root = n;
			return;
		}

		if (n instanceof OpNode) {
			if (this.root instanceof IntNode) {
				n.left = this.root;
				this.root = n;
			} else if (this.root instanceof OpNode) {
				if (n instanceof MultiplyNode || n instanceof DivideNode) {
					Node r = this.root.right;
					this.root.right = n;
					n.left = r;
				} else {
					n.left = this.root;
					this.root = n;
				}
			}
		} else if (n instanceof IntNode) {
			//always add ints to right most child
			Node curr = this.root;
			while (curr.right != null) {
				curr = curr.right;
			}
			curr.right = n;
		}
	}
}