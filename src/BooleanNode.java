
public abstract class BooleanNode {
	
	// stores the boolean value of the current node
	// the value can represent a single variable's boolean variable, a fixed boolean input, 
	// or a result of a sequence of boolean operations on multiple boolean variable and/or fixed inputs
	private boolean nodeValue;
	// method the return the boolean value of current node
	// if node = A, return A's boolean value
	// if node = A operation B, return A evaluate() (operation rule)  B evaluate();
	public abstract boolean evaluate();
	
	
	public boolean getNodeValue() {
		return this.nodeValue;
	}
	
	protected void setNodeValue(boolean value) {
		this.nodeValue=value;
	}
	
	
}
