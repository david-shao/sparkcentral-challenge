public class NodeFactory {
	private static NodeFactory instance = null;

	public static NodeFactory getInstance() {
		if (instance == null) {
			instance = new NodeFactory();
		}
		return instance;
	}

	private NodeFactory() {

	}

	public Node createNode(char c) throws Exception {
		switch (c) {
			case '+':
				return new AddNode(c);
			case '-':
				return new SubtractNode(c);
			case '*':
				return new MultiplyNode(c);
			case '/':
				return new DivideNode(c);
			default:
				throw new Exception("Unrecognized operand: " + c);
		}
	}

	public Node createNode(int v) {
		return new IntNode(v);
	}
}