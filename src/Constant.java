import java.util.Set;

public class Constant extends BooleanNode{
	// stores the boolean value of the current node
	// the value can represent a single variable's boolean variable, a fixed boolean input, 
	// or a result of a sequence of boolean operations on multiple boolean variable and/or fixed inputs
	private final boolean nodeValue;

	// if there exist any change of the boolean variable inside this node can change result of current node
	private final boolean invertible=false;
	
	// the Set of variables inside this node that can flip and flip all of them will cause inversion of current node result
	private final Set<Variable> variablesToFlip=Set.of();
	public Constant(boolean value) {
		this.nodeValue=value;
	}
	@Override
	public boolean evaluate() {
		// TODO Auto-generated method stub
		return nodeValue;
	}

	@Override
	public boolean getNodeValue() {
		// TODO Auto-generated method stub
		return nodeValue;
	}
	@Override
	public boolean isInvertible() {
		// TODO Auto-generated method stub
		return this.invertible;
	}
	@Override
	public Set<Variable> getVariablesToFlip() {
		// TODO Auto-generated method stub
		return this.variablesToFlip;
	}
	

}
