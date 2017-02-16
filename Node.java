public abstract class Node implements ICalculatable {
	protected Node left;
	protected Node right;

	public abstract double calculate();
}