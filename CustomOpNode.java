/**
 * Example custom operand class.
 */
public class CustomOpNode extends OpNode {
	public CustomOpNode(char c) {
		super(c);
	}

	@Override
	public double calculate() {
		//this is just an example
		return Math.abs(this.left.calculate() - this.right.calculate());
	}
}