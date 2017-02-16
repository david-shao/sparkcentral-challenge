public class SubtractNode extends OpNode {
	public SubtractNode(char c) {
		super(c);
	}

	@Override
	public double calculate() {
		return this.left.calculate() - this.right.calculate();
	}
}