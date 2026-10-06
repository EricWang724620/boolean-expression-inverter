
public abstract class BinaryOperation extends BooleanNode{
	protected BooleanNode left;
	protected BooleanNode right;
	
	public BinaryOperation(BooleanNode left, BooleanNode right) {
		this.left=left;
		this.right=right;
	}
}
