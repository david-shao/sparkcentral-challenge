public class MultiplyNode extends OpNode {
	public MultiplyNode(char c) {
		super(c);
	}

	@Override
	public double calculate() {
		return this.left.calculate() * this.right.calculate();
	}
}