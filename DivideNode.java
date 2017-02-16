public class DivideNode extends OpNode {
	public DivideNode(char c) {
		super(c);
	}

	@Override
	public double calculate() {
		return (double)this.left.calculate() / this.right.calculate();
	}
}