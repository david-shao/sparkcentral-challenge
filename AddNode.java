public class AddNode extends OpNode {
	public AddNode(char c) {
		super(c);
	}

	@Override
	public double calculate() {
		return this.left.calculate() + this.right.calculate();
	}
}