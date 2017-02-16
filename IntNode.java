public class IntNode extends Node {
	private int val;

	public IntNode(int v) {
		this.val = v;
	}

	@Override
	public double calculate() {
		return this.val;
	}
}